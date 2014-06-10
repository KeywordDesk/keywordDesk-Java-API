package com.encircle360.keyworddesk.client.pojos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * KeywordFilterResult POJO. This class represents a keyword filtering result.
 *
 * @author <a href="mailto:p.huetter@encircle360.com">Patrick Huetter</a>
 */
public class KeywordFilterResult implements Serializable {

    private ArrayList<Keyword> keywords;
    private Integer count;
    private Integer availableCount;

    public ArrayList<Keyword> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<Keyword> keywords) {
        this.keywords = keywords;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(Integer availableCount) {
        this.availableCount = availableCount;
    }
}
