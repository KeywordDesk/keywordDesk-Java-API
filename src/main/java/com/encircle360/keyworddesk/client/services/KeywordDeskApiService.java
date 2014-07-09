package com.encircle360.keyworddesk.client.services;

import com.encircle360.keyworddesk.client.pojos.*;
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
 */
public class KeywordDeskApiService {

    public static final Integer COUNT_TYPE_ALL = 0;
    public static final Integer COUNT_TYPE_SHORTTAIL = 1;
    public static final Integer COUNT_TYPE_LONGTAIL = 2;
    public static final Integer COUNT_TYPE_HAVE_PLANNER_DATA = 3;

    public static final String FIELD_SEARCHVOLUME = "searchVolume";
    public static final String FIELD_SUGGESTEDBID = "suggestedBid"; // also known as CPC
    public static final String FIELD_COMPETITION = "competition";
    public static final String FIELD_GOOGLE_RESULT_COUNT = "googleResultCount";
    public static final String FIELD_GOOGLE_INTITLE_COUNT = "googleInTitleCount";
    public static final String FIELD_SEARCHVOLUME_JANUARY = "searchVolumeJanuary";
    public static final String FIELD_SEARCHVOLUME_FEBRUARY = "searchVolumeFebruary";
    public static final String FIELD_SEARCHVOLUME_MARCH = "searchVolumeMarch";
    public static final String FIELD_SEARCHVOLUME_APRIL = "searchVolumeApril";
    public static final String FIELD_SEARCHVOLUME_MAY = "searchVolumeMay";
    public static final String FIELD_SEARCHVOLUME_JUNE = "searchVolumeJune";
    public static final String FIELD_SEARCHVOLUME_JULY = "searchVolumeJuly";
    public static final String FIELD_SEARCHVOLUME_AUGUST = "searchVolumeAugust";
    public static final String FIELD_SEARCHVOLUME_SEPTEMBER = "searchVolumeSeptember";
    public static final String FIELD_SEARCHVOLUME_OCTOBER = "searchVolumeOctober";
    public static final String FIELD_SEARCHVOLUME_NOVEMBER = "searchVolumeNovember";
    public static final String FIELD_SEARCHVOLUME_DECEMBER = "searchVolumeDecember";

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

                /** strings in switch are not supported in java < version 7
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
                 }*/

                if (field.equals(FIELD_SEARCHVOLUME)) {
                    keywordRequest.setSearchVolume(true);
                } else if (field.equals(FIELD_COMPETITION)) {
                    keywordRequest.setCompetition(true);
                } else if (field.equals(FIELD_SUGGESTEDBID)) {
                    keywordRequest.setSuggestedBid(true);
                } else if (field.equals(FIELD_GOOGLE_RESULT_COUNT)) {
                    keywordRequest.setGoogleResultCount(true);
                } else if (field.equals(FIELD_GOOGLE_INTITLE_COUNT)) {
                    keywordRequest.setGoogleInTitleCount(true);
                } else if (field.equals(FIELD_SEARCHVOLUME_JANUARY)) {
                    keywordRequest.setSearchVolumeJanuary(true);
                } else if (field.equals(FIELD_SEARCHVOLUME_FEBRUARY)) {
                    keywordRequest.setSearchVolumeFebruary(true);
                } else if (field.equals(FIELD_SEARCHVOLUME_MARCH)) {
                    keywordRequest.setSearchVolumeMarch(true);
                } else if (field.equals(FIELD_SEARCHVOLUME_APRIL)) {
                    keywordRequest.setSearchVolumeApril(true);
                } else if (field.equals(FIELD_SEARCHVOLUME_MAY)) {
                    keywordRequest.setSearchVolumeMay(true);
                } else if (field.equals(FIELD_SEARCHVOLUME_JUNE)) {
                    keywordRequest.setSearchVolumeJune(true);
                } else if (field.equals(FIELD_SEARCHVOLUME_JULY)) {
                    keywordRequest.setSearchVolumeJuly(true);
                } else if (field.equals(FIELD_SEARCHVOLUME_AUGUST)) {
                    keywordRequest.setSearchVolumeAugust(true);
                } else if (field.equals(FIELD_SEARCHVOLUME_SEPTEMBER)) {
                    keywordRequest.setSearchVolumeSeptember(true);
                } else if (field.equals(FIELD_SEARCHVOLUME_OCTOBER)) {
                    keywordRequest.setSearchVolumeOctober(true);
                } else if (field.equals(FIELD_SEARCHVOLUME_NOVEMBER)) {
                    keywordRequest.setSearchVolumeNovember(true);
                } else if (field.equals(FIELD_SEARCHVOLUME_DECEMBER)) {
                    keywordRequest.setSearchVolumeDecember(true);
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

    /**
     * Gets a list of keywords wich match the given filter.
     *
     * @param filter
     * @return an ArrayList wich holds all the keyword-objects.
     */
    public ArrayList<Keyword> filterKeywords(KeywordFilter filter) {
        KeywordFilterResult result = this.filter(filter);
        return result.getKeywords();
    }

    public KeywordFilterResult filter(KeywordFilter filter) {
        String jsonString = filter.toJSON();
        ArrayList<Keyword> keywordResultList = null;
        KeywordFilterResult result = null;

        try {
            String responseContent = this.sendHttpPost(this.getUrlApiBase() + "/filterKeywords", jsonString);
            JSONObject jsonObject = JSONObject.fromObject(responseContent);
            JSONArray jsonArray = jsonObject.getJSONArray("keywords");
            keywordResultList = (ArrayList<Keyword>) JSONArray.toCollection(jsonArray, Keyword.class);

            result = new KeywordFilterResult();
            result.setKeywords(keywordResultList);
            result.setCount(jsonObject.getInt("count"));
            result.setAvailableCount(jsonObject.getInt("availableCount"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * Returns the actual creditBalance of the api-user.
     * @return creditBalance object
     */
    public CreditBalance getCreditBalance() {
        CreditBalance creditBalance = null;
        try {
            String responseContent = this.sendHttpPost(this.getUrlApiBase() + "/getCreditBalance", "");
            JSONObject jsonObject = JSONObject.fromObject(responseContent);
            creditBalance = (CreditBalance) JSONObject.toBean(jsonObject, CreditBalance.class);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return creditBalance;
    }

    /**
     * Returns true if the current api-user has credits (credits > 0)
     * @return true or false
     */
    public Boolean hasCredits() {
        if(this.getCreditBalance().getCreditsLeft() > 0) {
            return true;
        }
        return false;
    }

    /**
     * Order keyword-data (or request refreshing of data) wich isn't in the keyworddesk database. You'll get a push notification to the url you specified in your api backend if the job is completed, so you don't need to pull the api.
     * @param keywordRequest
     * @return the job id of the created job for this request or null if request failed
     */
    public String orderKeywordData(KeywordRequest keywordRequest) {
        ArrayList<KeywordRequest> keywordRequests = new ArrayList<KeywordRequest>();
        keywordRequests.add(keywordRequest);
        return this.orderKeywordData(keywordRequests);
    }

    /**
     * Order keyword-data (or request refreshing of data) wich isn't in the keyworddesk database. You'll get a push notification to the url you specified in your api backend if the job is completed, so you don't need to pull the api.
     * @param keywordRequestList
     * @return the job id of the created job for this request or null if request failed
     */
    public String orderKeywordData(ArrayList<KeywordRequest> keywordRequestList) {

        String jsonString = JSONArray.fromObject(keywordRequestList).toString();
        String jobId = null;

        try {
            String responseContent = this.sendHttpPost(this.getUrlApiBase() + "/orderKeywordData", jsonString);
            JSONObject jsonObject = JSONObject.fromObject(responseContent);
            JSONObject jobCreated = (JSONObject) jsonObject.get("jobCreated");
            jobId = jobCreated.getString("id");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return jobId;
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
