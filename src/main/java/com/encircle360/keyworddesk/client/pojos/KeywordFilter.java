package com.encircle360.keyworddesk.client.pojos;

import net.sf.json.JSONObject;

import java.util.ArrayList;

/**
 * KeywordFilter POJO. This class represents a keyword filter.
 *
 * @author <a href="mailto:p.huetter@encircle360.com">Patrick Huetter</a>
 */
public class KeywordFilter {

    public static final String FILTER_TEXT_ILIKE = "ILike";
    public static final String FILTER_TEXT_NOT_ILIKE = "NotILike";
    public static final String FILTER_TEXT_LIKE = "Like";
    public static final String FILTER_TEXT_NOT_LIKE = "NotLike";
    public static final String FILTER_TEXT_EQUAL = "Equal";
    public static final String FILTER_TEXT_NOT_EQUAL = "NotEqual";
    public static final String FILTER_TEXT_IBEGINS_WITH = "IBeginsWith";
    public static final String FILTER_TEXT_BEGINS_WITH = "BeginsWith";
    public static final String FILTER_TEXT_IENDS_WITH = "IEndsWith";
    public static final String FILTER_TEXT_ENDS_WITH = "EndsWith";

    public static final String FILTER_NUMBER_EQUAL = "Equal";
    public static final String FILTER_NUMBER_NOT_EQUAL = "NotEqual";
    public static final String FILTER_NUMBER_LESS_THAN = "LessThan";
    public static final String FILTER_NUMBER_LESS_THAN_EQUALS = "LessThanEquals";
    public static final String FILTER_NUMBER_GREATER_THAN = "GreaterThan";
    public static final String FILTER_NUMBER_GREATER_THAN_EQUALS = "GreaterThanEquals";
    public static final String FILTER_NUMBER_BETWEEN = "Between";
    public static final String FILTER_NUMBER_IS_NULL = "IsNull";
    public static final String FILTER_NUMBER_IS_NOT_NULL = "IsNotNull";

    // values
    private Integer max;
    private String sort;
    private String order;
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

    // fields to get from the request
    private ArrayList<String> fieldsToGet;

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

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ArrayList<String> getFieldsToGet() {
        return fieldsToGet;
    }

    public void setFieldsToGet(ArrayList<String> fieldsToGet) {
        this.fieldsToGet = fieldsToGet;
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

        if (this.getGoogleResultCount() != null) {
            filterObject.put("googleResultCount", this.getGoogleResultCount().toString());
        } else {
            filterObject.put("googleResultCount", "");
        }

        if (this.getGoogleResultCountTo() != null) {
            filterObject.put("googleResultCountTo", this.getGoogleResultCountTo().toString());
        } else {
            filterObject.put("googleResultCountTo", "");
        }

        if (this.getSearchVolume() != null) {
            filterObject.put("searchVolume", this.getSearchVolume().toString());
        } else {
            filterObject.put("searchVolume", "");
        }

        if (this.getSearchVolumeTo() != null) {
            filterObject.put("searchVolumeTo", this.getSearchVolumeTo().toString());
        } else {
            filterObject.put("searchVolumeTo", "");
        }

        if (this.getSuggestedBid() != null) {
            filterObject.put("suggestedBid", this.getSuggestedBid().toString());
        } else {
            filterObject.put("suggestedBid", "");
        }

        if (this.getSuggestedBidTo() != null) {
            filterObject.put("suggestedBidTo", this.getSuggestedBidTo().toString());
        } else {
            filterObject.put("suggestedBidTo", "");
        }

        if (this.getGoogleInTitleCount() != null) {
            filterObject.put("googleInTitleCount", this.getGoogleInTitleCount().toString());
        } else {
            filterObject.put("googleInTitleCount", "");
        }

        if (this.getGoogleInTitleCountTo() != null) {
            filterObject.put("googleInTitleCountTo", this.getGoogleInTitleCountTo().toString());
        } else {
            filterObject.put("googleInTitleCountTo", "");
        }

        if (this.getCompetition() != null) {
            filterObject.put("competition", this.getCompetition().toString());
        } else {
            filterObject.put("competition", "");
        }

        if (this.getCompetitionTo() != null) {
            filterObject.put("competitionTo", this.getCompetitionTo().toString());
        } else {
            filterObject.put("competitionTo", "");
        }

        if (this.getTermCount() != null) {
            filterObject.put("termCount", this.getTermCountTo().toString());
        } else {
            filterObject.put("termCount", "");
        }

        if(this.getTermCountTo() != null) {
            filterObject.put("termCountTo", this.getTermCountTo().toString());
        } else {
            filterObject.put("termCountTo", "");
        }

        // add operations to filterObject
        filterObject.put("op", operationsObject);

        // test
/*        filterObject.put("op.searchVolume", this.getOpSearchVolume());
        filterObject.put("op.keyword", this.getOpKeyword());*/

        // create final json object for a filter request
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("filter", filterObject);
        jsonObject.put("max", this.getMax());
        jsonObject.put("listDistinct", this.getListDistinct());
        jsonObject.put("sort", this.getSort());
        jsonObject.put("order", this.getOrder());

        // test
/*
        jsonObject.put("filter.op.searchVolume", this.getOpSearchVolume());
        jsonObject.put("filter.op.keyword", this.getOpKeyword());
        jsonObject.put("filter.keyword", this.getKeyword());
        jsonObject.put("filter.searchVolume", this.getSearchVolume().toString());
        jsonObject.put("filter.searchVolumeTo", this.getSearchVolumeTo().toString());
        jsonObject.put("filter.keyword", this.getKeyword());*/


        // add fields to get to json
        jsonObject.put("fieldsRequested", this.getFieldsToGet());

        String jsonString = jsonObject.toString();

        return jsonString;
    }
}
