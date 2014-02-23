package com.encircle360.keyworddesk.client.services;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
import java.io.StringWriter;

/**
 * The example KeywordDesk API Service class. Use this class as example for communication with our api.
 * This class acts as a API-Wrapper.
 *
 * @author <a href="mailto:p.huetter@encircle360.com">Patrick Huetter</a>
 * @version 0.1 ALPHA
 */
public class KeywordDeskApiService {

    private String token;

    // the url for the api login
    private String urlApiLogin = "http://api.keyworddesk.com/api/login";

    // the url to the api base including the version tag for the api version you want to use
    private String urlApiBase = "http://api.keyworddesk.com/v1";

    /**
     * Constructor wich does a login for you. Do only login with this method when your token is expired or you login the first time.
     *
     * @param username
     * @param password
     */
    public KeywordDeskApiService(String username, String password) {
        this.login(username, password);
    }

    /**
     * Constructor wich sets the the given token to use for further api requests.
     * Use this constructor if you already have an API-token.
     *
     * @param token
     */
    public KeywordDeskApiService(String token) {
        this.setToken(token);
    }

    /**
     * Api-Login with the given username and password.
     * When login was successful, token gets saved into token variable and will be used for further api access.
     *
     * @param username
     * @param password
     * @return token String if login was successful or null if login failed
     */
    public String login(String username, String password) {

        // build json with credentials for login
        JSONObject json = new JSONObject();
        json.put("username", username);
        json.put("password", password);
        String jsonString = json.toString();
        String token = null;

        try {

            // create http post
            String responseContent = this.sendHttpPost(this.getUrlApiLogin(), jsonString);

            if (!responseContent.isEmpty()) {

                // create object from json response and save token to member variable
                JSONObject responseObject = JSONObject.fromObject(responseContent);
                token = responseObject.getString("token");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        this.setToken(token);
        return token;
    }

    /**
     * Sends a HTTP POST with the given body to the given url.
     *
     * @param url
     * @param body
     * @return response body as String
     * @throws IOException
     */
    private String sendHttpPost(String url, String body) throws IOException {
        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);

        // set x-auth-token when request isn't a login request
        if (!url.equals(this.getUrlApiLogin())) {
            post.setHeader("X-Auth-Token", this.getToken());
        }

        StringEntity input = new StringEntity(body);
        post.setEntity(input);
        HttpResponse response = client.execute(post);
        StringWriter writer = new StringWriter();
        IOUtils.copy(response.getEntity().getContent(), writer, "UTF-8");
        String responseContent = writer.toString();

        return responseContent;
    }

    /**
     * Gets the keyword data for the requested keywords. Only gets the fields you requested e.g. "searchVolume", "suggestedBid" etc.
     *
     * @param keywords
     * @param fieldsToGet
     * @return a JSONArray wich holds all the keywordobjects with the requested data filled in.
     */
    public JSONArray getKeywordData(String[] keywords, String[] fieldsToGet) {
        JSONArray jsonArray = new JSONArray();
        JSONObject keywordObject = null;
        JSONArray jsonResultArray = null;

        for (String keyword : keywords) {
            keywordObject = new JSONObject();

            // create jsonobject for each keyword
            keywordObject.put("keyword", keyword);

            // add wanted fields to json object
            for (String field : fieldsToGet) {
                keywordObject.put(field, true);
            }

            // add ready json object to jsonArray
            jsonArray.add(keywordObject);
        }

        String jsonString = jsonArray.toString();

        try {
            String responseContent = this.sendHttpPost(this.getUrlApiBase() + "/getKeywordData", jsonString);
            jsonResultArray = JSONArray.fromObject(responseContent);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonResultArray;
    }

    public String getUrlApiLogin() {
        return urlApiLogin;
    }

    public String getUrlApiBase() {
        return urlApiBase;
    }

    private void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
