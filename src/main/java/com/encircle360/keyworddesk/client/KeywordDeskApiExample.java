package com.encircle360.keyworddesk.client;

import com.encircle360.keyworddesk.client.pojos.Keyword;
import com.encircle360.keyworddesk.client.pojos.KeywordFilter;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import com.encircle360.keyworddesk.client.services.KeywordDeskApiService;

import java.util.ArrayList;

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
        ArrayList<String> keywords = new ArrayList<String>();
        keywords.add("test");
        keywords.add("handyvertrag");

        // fields you want to get on the given keywords
        ArrayList<String> fields = new ArrayList<String>();
        fields.add("searchVolume"); // in this example we only need the searchVolume

        KeywordDeskApiService apiService = new KeywordDeskApiService("USERNAME", "PASSWORD");

        // we could also use a token to login, if we already have one
        // KeywordDeskApiService apiService = new KeywordDeskApiService("YOUR-TOKEN-HERE");

        Integer count = apiService.getKeywordCount(KeywordDeskApiService.COUNT_TYPE_ALL);
        System.out.println("Keywords in database: " + count);

        KeywordFilter keywordFilter = new KeywordFilter();
        keywordFilter.setKeyword("handy kaufen");
        keywordFilter.setOpKeyword(KeywordDeskApiService.FILTER_ILIKE);

        ArrayList<Keyword> filteredKeywordList = apiService.filterKeywords(keywordFilter);
        for(Keyword keyword : filteredKeywordList) {
            System.out.println("Filtered keyword: " + keyword.getKeyword());
        }

        ArrayList<Keyword> keywordList = apiService.getKeywordData(keywords, fields);
        for (Keyword keyword : keywordList) {
            System.out.println("Searchvolume of keyword '" + keyword.getKeyword() + "' is " + keyword.getSearchVolume());
        }
    }
}
