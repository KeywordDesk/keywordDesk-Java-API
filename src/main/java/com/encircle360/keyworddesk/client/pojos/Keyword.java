package com.encircle360.keyworddesk.client.pojos;

/**
 * Keyword POJO. This class represents a keyword with its data.
 *
 * @author <a href="mailto:p.huetter@encircle360.com">Patrick Huetter</a>
 */
public class Keyword {

    private String keyword;
    private Long searchVolume;
    private Double suggestedBid;
    private Long googleResultCount;
    private Long googleInTitleCount;
    private Integer competition;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Long getSearchVolume() {
        return searchVolume;
    }

    public void setSearchVolume(Long searchVolume) {
        this.searchVolume = searchVolume;
    }

    public Double getSuggestedBid() {
        return suggestedBid;
    }

    public void setSuggestedBid(Double suggestedBid) {
        this.suggestedBid = suggestedBid;
    }

    public Long getGoogleResultCount() {
        return googleResultCount;
    }

    public void setGoogleResultCount(Long googleResultCount) {
        this.googleResultCount = googleResultCount;
    }

    public Long getGoogleInTitleCount() {
        return googleInTitleCount;
    }

    public void setGoogleInTitleCount(Long googleInTitleCount) {
        this.googleInTitleCount = googleInTitleCount;
    }

    public Integer getCompetition() {
        return competition;
    }

    public void setCompetition(Integer competition) {
        this.competition = competition;
    }
}
