package com.encircle360.keyworddesk.client.pojos;

import java.io.Serializable;

/**
 * KeywordRequest POJO. This class represents a keyword request.
 *
 * @author <a href="mailto:p.huetter@encircle360.com">Patrick Huetter</a>
 */
public class KeywordRequest implements Serializable {

    private String keyword;
    private Boolean searchVolume;
    private Boolean competition;
    private Boolean suggestedBid;
    private Boolean googleResultCount;
    private Boolean googleInTitleCount;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Boolean getSearchVolume() {
        return searchVolume;
    }

    public void setSearchVolume(Boolean searchVolume) {
        this.searchVolume = searchVolume;
    }

    public Boolean getCompetition() {
        return competition;
    }

    public void setCompetition(Boolean competition) {
        this.competition = competition;
    }

    public Boolean getSuggestedBid() {
        return suggestedBid;
    }

    public void setSuggestedBid(Boolean suggestedBid) {
        this.suggestedBid = suggestedBid;
    }

    public Boolean getGoogleResultCount() {
        return googleResultCount;
    }

    public void setGoogleResultCount(Boolean googleResultCount) {
        this.googleResultCount = googleResultCount;
    }

    public Boolean getGoogleInTitleCount() {
        return googleInTitleCount;
    }

    public void setGoogleInTitleCount(Boolean googleInTitleCount) {
        this.googleInTitleCount = googleInTitleCount;
    }
}
