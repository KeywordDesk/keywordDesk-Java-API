package com.encircle360.keyworddesk.client.pojos;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

/**
 * KeywordFilter POJO. This class represents a keyword filter.
 *
 * @author <a href="mailto:p.huetter@encircle360.com">Patrick Huetter</a>
 * @version 0.1 ALPHA
 */
public class KeywordFilter {

    // values
    private Integer max;
    private String sort;
    private Boolean listDistinct;
    private String keyword;
    private Integer googleResultCount;
    private Integer googleResultCountTo;
    private Integer searchVolume;
    private Integer searchVolumeTo;
    private Double suggestedBid;
    private Double suggestedBidTo;
    private Integer googleInTitleCount;
    private Integer googleInTitleCountTo;
    private Integer competition;
    private Integer competitionTo;
    private Integer termCount;
    private Integer termCountTo;

    // operations
    private String opKeyword;
    private String opGoogleResultCount;
    private String opSearchVolume;
    private String opSuggestedBid;
    private String opGoogleInTitleCount;
    private String opCompetition;
    private String opTermCount;


    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Boolean getListDistinct() {
        return listDistinct;
    }

    public void setListDistinct(Boolean listDistinct) {
        this.listDistinct = listDistinct;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getGoogleResultCount() {
        return googleResultCount;
    }

    public void setGoogleResultCount(Integer googleResultCount) {
        this.googleResultCount = googleResultCount;
    }

    public Integer getSearchVolume() {
        return searchVolume;
    }

    public void setSearchVolume(Integer searchVolume) {
        this.searchVolume = searchVolume;
    }

    public Integer getSearchVolumeTo() {
        return searchVolumeTo;
    }

    public void setSearchVolumeTo(Integer searchVolumeTo) {
        this.searchVolumeTo = searchVolumeTo;
    }

    public Double getSuggestedBid() {
        return suggestedBid;
    }

    public void setSuggestedBid(Double suggestedBid) {
        this.suggestedBid = suggestedBid;
    }

    public Double getSuggestedBidTo() {
        return suggestedBidTo;
    }

    public void setSuggestedBidTo(Double suggestedBidTo) {
        this.suggestedBidTo = suggestedBidTo;
    }

    public Integer getGoogleInTitleCount() {
        return googleInTitleCount;
    }

    public void setGoogleInTitleCount(Integer googleInTitleCount) {
        this.googleInTitleCount = googleInTitleCount;
    }

    public Integer getGoogleInTitleCountTo() {
        return googleInTitleCountTo;
    }

    public void setGoogleInTitleCountTo(Integer googleInTitleCountTo) {
        this.googleInTitleCountTo = googleInTitleCountTo;
    }

    public Integer getCompetition() {
        return competition;
    }

    public void setCompetition(Integer competition) {
        this.competition = competition;
    }

    public Integer getCompetitionTo() {
        return competitionTo;
    }

    public void setCompetitionTo(Integer competitionTo) {
        this.competitionTo = competitionTo;
    }

    public Integer getTermCount() {
        return termCount;
    }

    public void setTermCount(Integer termCount) {
        this.termCount = termCount;
    }

    public Integer getTermCountTo() {
        return termCountTo;
    }

    public void setTermCountTo(Integer termCountTo) {
        this.termCountTo = termCountTo;
    }

    public String getOpKeyword() {
        return opKeyword;
    }

    public void setOpKeyword(String opKeyword) {
        this.opKeyword = opKeyword;
    }

    public String getOpGoogleResultCount() {
        return opGoogleResultCount;
    }

    public void setOpGoogleResultCount(String opGoogleResultCount) {
        this.opGoogleResultCount = opGoogleResultCount;
    }

    public String getOpSearchVolume() {
        return opSearchVolume;
    }

    public void setOpSearchVolume(String opSearchVolume) {
        this.opSearchVolume = opSearchVolume;
    }

    public String getOpSuggestedBid() {
        return opSuggestedBid;
    }

    public void setOpSuggestedBid(String opSuggestedBid) {
        this.opSuggestedBid = opSuggestedBid;
    }

    public String getOpGoogleInTitleCount() {
        return opGoogleInTitleCount;
    }

    public void setOpGoogleInTitleCount(String opGoogleInTitleCount) {
        this.opGoogleInTitleCount = opGoogleInTitleCount;
    }

    public String getOpCompetition() {
        return opCompetition;
    }

    public void setOpCompetition(String opCompetition) {
        this.opCompetition = opCompetition;
    }

    public String getOpTermCount() {
        return opTermCount;
    }

    public void setOpTermCount(String opTermCount) {
        this.opTermCount = opTermCount;
    }

    public Integer getGoogleResultCountTo() {
        return googleResultCountTo;
    }

    public void setGoogleResultCountTo(Integer googleResultCountTo) {
        this.googleResultCountTo = googleResultCountTo;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * Creates a json string for a keyworddesk filter request.
     *
     * @return this object as json string
     */
    public String toJSON() {

        // create operations json object
        JSONObject operationsObject = new JSONObject();
        operationsObject.put("keyword", this.getOpKeyword());
        operationsObject.put("googleResultCount", this.getOpGoogleResultCount());
        operationsObject.put("searchVolume", this.getOpSearchVolume());
        operationsObject.put("suggestedBid", this.getOpSuggestedBid());
        operationsObject.put("googleInTitleCount", this.getOpGoogleInTitleCount());
        operationsObject.put("competition", this.getOpCompetition());
        operationsObject.put("termCount", this.getOpTermCount());

        // create filter object
        JSONObject filterObject = new JSONObject();
        filterObject.put("keyword", this.getKeyword());
        filterObject.put("googleResultCount", this.getGoogleResultCount());
        filterObject.put("googleResultCountTo", this.getGoogleResultCountTo());
        filterObject.put("searchVolume", this.getSearchVolume());
        filterObject.put("searchVolumeTo", this.getSearchVolumeTo());
        filterObject.put("suggestedBid", this.getSuggestedBid());
        filterObject.put("suggestedBidTo", this.getSuggestedBidTo());
        filterObject.put("googleInTitleCount", this.getGoogleInTitleCount());
        filterObject.put("googleInTitleCountTo", this.getGoogleInTitleCountTo());
        filterObject.put("competition", this.getCompetition());
        filterObject.put("competitionTo", this.getCompetitionTo());
        filterObject.put("termCount", this.getTermCountTo());

        // add operations to filterObject
        filterObject.put("op", operationsObject);

        // create final json object for a filter request
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("filter", filterObject);
        jsonObject.put("max", this.getMax());
        jsonObject.put("listDistinct", this.getListDistinct());
        jsonObject.put("sort", this.getSort());
        String jsonString = jsonObject.toString();

        return jsonString;
    }
}