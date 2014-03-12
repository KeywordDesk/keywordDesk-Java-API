package com.encircle360.keyworddesk.client.services;

import com.encircle360.keyworddesk.client.pojos.Keyword;
import com.encircle360.keyworddesk.client.pojos.KeywordRequest;
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
import java.util.ArrayList;
import java.util.List;

/**
 * The example KeywordDesk API Service class. Use this class as example for communication with our api.
 * This class acts as a API-Wrapper.
 *
 * @author <a href="mailto:p.huetter@encircle360.com">Patrick Huetter</a>
 * @version 0.1 ALPHA
 */
public class KeywordDeskApiService {

    public static final Integer COUNT_TYPE_ALL = 0;
    public static final Integer COUNT_TYPE_SHORTTAIL = 1;
    public static final Integer COUNT_TYPE_LONGTAIL = 2;
    public static final Integer COUNT_TYPE_HAVE_PLANNER_DATA = 3;

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
     * @return a ArrayList wich holds all the keyword-objects with the requested data filled in.
     */
    public ArrayList<Keyword> getKeywordData(List<String> keywords, List<String> fieldsToGet) {
        ArrayList<KeywordRequest> keywordRequestList = new ArrayList<KeywordRequest>();
        KeywordRequest keywordRequest = null;
        ArrayList<Keyword> keywordResultList = null;

        for (String keyword : keywords) {
            keywordRequest = new KeywordRequest();
            keywordRequest.setKeyword(keyword);

            // add wanted fields to request object
            for (String field : fieldsToGet) {
                switch (field) {
                    case "searchVolume":
                        keywordRequest.setSearchVolume(true);
                        break;

                    case "competition":
                        keywordRequest.setCompetition(true);
                        break;

                    case "suggestedBid":
                        keywordRequest.setSuggestedBid(true);
                        break;

                    case "googleResultCount":
                        keywordRequest.setGoogleResultCount(true);
                        break;

                    case "googleInTitleCount":
                        keywordRequest.setGoogleInTitleCount(true);
                }
            }

            // add ready keywordRequest object to list
            keywordRequestList.add(keywordRequest);
        }

        String jsonString = JSONArray.fromObject(keywordRequestList).toString();

        try {
            String responseContent = this.sendHttpPost(this.getUrlApiBase() + "/getKeywordData", jsonString);
            JSONArray jsonArray = JSONArray.fromObject(responseContent);
            keywordResultList = (ArrayList<Keyword>) JSONArray.toCollection(jsonArray, Keyword.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return keywordResultList;
    }

    /**
     * Gets the keyword data for the requested keywords by their keyword-request-settings.
     *
     * @param keywordRequestList
     * @return a list of keywords wich were requested
     */
    public ArrayList<Keyword> getKeywordData(List<KeywordRequest> keywordRequestList) {
        ArrayList<Keyword> keywordResultList = new ArrayList<Keyword>();
        String jsonString = JSONArray.fromObject(keywordRequestList).toString();

        try {
            String responseContent = this.sendHttpPost(this.getUrlApiBase() + "/getKeywordData", jsonString);
            JSONArray jsonArray = JSONArray.fromObject(responseContent);
            keywordResultList = (ArrayList<Keyword>) JSONArray.toCollection(jsonArray, Keyword.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return keywordResultList;
    }

    /**
     * Gets the count of keyword of a special type in the keyworddesk database.
     *
     * @param countType
     * @return the count of the requested type or null if the api call failed
     */
    public Integer getKeywordCount(Integer countType) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("countType", countType);
        String jsonString = jsonObject.toString();
        Integer count = null;

        try {
            String responseContent = this.sendHttpPost(this.getUrlApiBase() + "/getKeywordCount", jsonString);
            JSONObject responseObject = JSONObject.fromObject(responseContent);
            count = (Integer) responseObject.get("count");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
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
