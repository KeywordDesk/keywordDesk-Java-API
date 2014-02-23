package com.encircle360.keyworddesk.client;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import com.encircle360.keyworddesk.client.services.KeywordDeskApiService;

/**
 * Class wich holds the main method. This is our entry point.
 *
 * @author <a href="mailto:p.huetter@encircle360.com">Patrick Huetter</a>
 * @version 0.1 ALPHA
 */
public class KeywordDeskApiExample {

    /**
     * Entry point of the API example.
     *
     * @param args
     */
    public static void main(String[] args) {

        // some dummy keywords
        String[] keywords = new String[2];
        keywords[0] = "test";
        keywords[1] = "handyvertrag";

        // fields you want to get on the given keywords
        String[] fields = new String[1];
        fields[0] = "searchVolume"; // in this example we only need the searchVolume

        KeywordDeskApiService apiService = new KeywordDeskApiService("FabianRossbacher", "crawlme2014");

        // we could also use a token to login, if we already have one
        // KeywordDeskApiService apiService = new KeywordDeskApiService("YOUR-TOKEN-HERE");


        JSONArray keywordData = apiService.getKeywordData(keywords, fields);
        Object[] keywordDataArray = keywordData.toArray();
        for (Object keyword : keywordDataArray) {

            JSONObject jsonKeyword = (JSONObject) keyword;
            Long searchVolume = jsonKeyword.getLong("searchVolume");
            String keywordName = jsonKeyword.getString("keyword");

            System.out.println("Searchvolume of keyword '" + keywordName + "' is " + searchVolume.toString());
        }
    }
}
