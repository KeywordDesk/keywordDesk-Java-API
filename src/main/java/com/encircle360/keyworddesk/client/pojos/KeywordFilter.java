package com.encircle360.keyworddesk.client.pojos;

import net.sf.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * KeywordFilter POJO. This class represents a keyword filter.
 *
 * @author <a href="mailto:p.huetter@encircle360.com">Patrick Huetter</a>
 */
public class KeywordFilter implements Serializable {

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

    public static final String FILTER_NUMERIC_EQUAL = "Equal";
    public static final String FILTER_NUMERIC_NOT_EQUAL = "NotEqual";
    public static final String FILTER_NUMERIC_LESS_THAN = "LessThan";
    public static final String FILTER_NUMERIC_LESS_THAN_EQUALS = "LessThanEquals";
    public static final String FILTER_NUMERIC_GREATER_THAN = "GreaterThan";
    public static final String FILTER_NUMERIC_GREATER_THAN_EQUALS = "GreaterThanEquals";
    public static final String FILTER_NUMERIC_BETWEEN = "Between";
    public static final String FILTER_NUMERIC_IS_NULL = "IsNull";
    public static final String FILTER_NUMERIC_IS_NOT_NULL = "IsNotNull";

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

    private Integer searchVolumeJanuary;
    private Integer searchVolumeJanuaryTo;

    private Integer searchVolumeFebruary;
    private Integer searchVolumeFebruaryTo;

    private Integer searchVolumeMarch;
    private Integer searchVolumeMarchTo;

    private Integer searchVolumeApril;
    private Integer searchVolumeAprilTo;

    private Integer searchVolumeMay;
    private Integer searchVolumeMayTo;

    private Integer searchVolumeJune;
    private Integer searchVolumeJuneTo;

    private Integer searchVolumeJuly;
    private Integer searchVolumeJulyTo;

    private Integer searchVolumeAugust;
    private Integer searchVolumeAugustTo;

    private Integer searchVolumeSeptember;
    private Integer searchVolumeSeptemberTo;

    private Integer searchVolumeOctober;
    private Integer searchVolumeOctoberTo;

    private Integer searchVolumeNovember;
    private Integer searchVolumeNovemberTo;

    private Integer searchVolumeDecember;
    private Integer searchVolumeDecemberTo;

    // operations
    private String opKeyword;
    private String opGoogleResultCount;
    private String opSearchVolume;
    private String opSuggestedBid;
    private String opGoogleInTitleCount;
    private String opCompetition;
    private String opTermCount;
    private String opSearchVolumeJanuary;
    private String opSearchVolumeFebruary;
    private String opSearchVolumeMarch;
    private String opSearchVolumeApril;
    private String opSearchVolumeMay;
    private String opSearchVolumeJune;
    private String opSearchVolumeJuly;
    private String opSearchVolumeAugust;
    private String opSearchVolumeSeptember;
    private String opSearchVolumeOctober;
    private String opSearchVolumeNovember;
    private String opSearchVolumeDecember;

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

    public String getOpSearchVolumeJanuary() {
        return opSearchVolumeJanuary;
    }

    public void setOpSearchVolumeJanuary(String opSearchVolumeJanuary) {
        this.opSearchVolumeJanuary = opSearchVolumeJanuary;
    }

    public String getOpSearchVolumeFebruary() {
        return opSearchVolumeFebruary;
    }

    public void setOpSearchVolumeFebruary(String opSearchVolumeFebruary) {
        this.opSearchVolumeFebruary = opSearchVolumeFebruary;
    }

    public String getOpSearchVolumeMarch() {
        return opSearchVolumeMarch;
    }

    public void setOpSearchVolumeMarch(String opSearchVolumeMarch) {
        this.opSearchVolumeMarch = opSearchVolumeMarch;
    }

    public String getOpSearchVolumeApril() {
        return opSearchVolumeApril;
    }

    public void setOpSearchVolumeApril(String opSearchVolumeApril) {
        this.opSearchVolumeApril = opSearchVolumeApril;
    }

    public String getOpSearchVolumeMay() {
        return opSearchVolumeMay;
    }

    public void setOpSearchVolumeMay(String opSearchVolumeMay) {
        this.opSearchVolumeMay = opSearchVolumeMay;
    }

    public String getOpSearchVolumeJune() {
        return opSearchVolumeJune;
    }

    public void setOpSearchVolumeJune(String opSearchVolumeJune) {
        this.opSearchVolumeJune = opSearchVolumeJune;
    }

    public String getOpSearchVolumeJuly() {
        return opSearchVolumeJuly;
    }

    public void setOpSearchVolumeJuly(String opSearchVolumeJuly) {
        this.opSearchVolumeJuly = opSearchVolumeJuly;
    }

    public String getOpSearchVolumeAugust() {
        return opSearchVolumeAugust;
    }

    public void setOpSearchVolumeAugust(String opSearchVolumeAugust) {
        this.opSearchVolumeAugust = opSearchVolumeAugust;
    }

    public String getOpSearchVolumeSeptember() {
        return opSearchVolumeSeptember;
    }

    public void setOpSearchVolumeSeptember(String opSearchVolumeSeptember) {
        this.opSearchVolumeSeptember = opSearchVolumeSeptember;
    }

    public String getOpSearchVolumeOctober() {
        return opSearchVolumeOctober;
    }

    public void setOpSearchVolumeOctober(String opSearchVolumeOctober) {
        this.opSearchVolumeOctober = opSearchVolumeOctober;
    }

    public String getOpSearchVolumeNovember() {
        return opSearchVolumeNovember;
    }

    public void setOpSearchVolumeNovember(String opSearchVolumeNovember) {
        this.opSearchVolumeNovember = opSearchVolumeNovember;
    }

    public String getOpSearchVolumeDecember() {
        return opSearchVolumeDecember;
    }

    public void setOpSearchVolumeDecember(String opSearchVolumeDecember) {
        this.opSearchVolumeDecember = opSearchVolumeDecember;
    }

    public Integer getSearchVolumeJanuary() {
        return searchVolumeJanuary;
    }

    public void setSearchVolumeJanuary(Integer searchVolumeJanuary) {
        this.searchVolumeJanuary = searchVolumeJanuary;
    }

    public Integer getSearchVolumeJanuaryTo() {
        return searchVolumeJanuaryTo;
    }

    public void setSearchVolumeJanuaryTo(Integer searchVolumeJanuaryTo) {
        this.searchVolumeJanuaryTo = searchVolumeJanuaryTo;
    }

    public Integer getSearchVolumeFebruary() {
        return searchVolumeFebruary;
    }

    public void setSearchVolumeFebruary(Integer searchVolumeFebruary) {
        this.searchVolumeFebruary = searchVolumeFebruary;
    }

    public Integer getSearchVolumeFebruaryTo() {
        return searchVolumeFebruaryTo;
    }

    public void setSearchVolumeFebruaryTo(Integer searchVolumeFebruaryTo) {
        this.searchVolumeFebruaryTo = searchVolumeFebruaryTo;
    }

    public Integer getSearchVolumeMarch() {
        return searchVolumeMarch;
    }

    public void setSearchVolumeMarch(Integer searchVolumeMarch) {
        this.searchVolumeMarch = searchVolumeMarch;
    }

    public Integer getSearchVolumeMarchTo() {
        return searchVolumeMarchTo;
    }

    public void setSearchVolumeMarchTo(Integer searchVolumeMarchTo) {
        this.searchVolumeMarchTo = searchVolumeMarchTo;
    }

    public Integer getSearchVolumeApril() {
        return searchVolumeApril;
    }

    public void setSearchVolumeApril(Integer searchVolumeApril) {
        this.searchVolumeApril = searchVolumeApril;
    }

    public Integer getSearchVolumeAprilTo() {
        return searchVolumeAprilTo;
    }

    public void setSearchVolumeAprilTo(Integer searchVolumeAprilTo) {
        this.searchVolumeAprilTo = searchVolumeAprilTo;
    }

    public Integer getSearchVolumeMay() {
        return searchVolumeMay;
    }

    public void setSearchVolumeMay(Integer searchVolumeMay) {
        this.searchVolumeMay = searchVolumeMay;
    }

    public Integer getSearchVolumeMayTo() {
        return searchVolumeMayTo;
    }

    public void setSearchVolumeMayTo(Integer searchVolumeMayTo) {
        this.searchVolumeMayTo = searchVolumeMayTo;
    }

    public Integer getSearchVolumeJune() {
        return searchVolumeJune;
    }

    public void setSearchVolumeJune(Integer searchVolumeJune) {
        this.searchVolumeJune = searchVolumeJune;
    }

    public Integer getSearchVolumeJuneTo() {
        return searchVolumeJuneTo;
    }

    public void setSearchVolumeJuneTo(Integer searchVolumeJuneTo) {
        this.searchVolumeJuneTo = searchVolumeJuneTo;
    }

    public Integer getSearchVolumeJuly() {
        return searchVolumeJuly;
    }

    public void setSearchVolumeJuly(Integer searchVolumeJuly) {
        this.searchVolumeJuly = searchVolumeJuly;
    }

    public Integer getSearchVolumeJulyTo() {
        return searchVolumeJulyTo;
    }

    public void setSearchVolumeJulyTo(Integer searchVolumeJulyTo) {
        this.searchVolumeJulyTo = searchVolumeJulyTo;
    }

    public Integer getSearchVolumeAugust() {
        return searchVolumeAugust;
    }

    public void setSearchVolumeAugust(Integer searchVolumeAugust) {
        this.searchVolumeAugust = searchVolumeAugust;
    }

    public Integer getSearchVolumeAugustTo() {
        return searchVolumeAugustTo;
    }

    public void setSearchVolumeAugustTo(Integer searchVolumeAugustTo) {
        this.searchVolumeAugustTo = searchVolumeAugustTo;
    }

    public Integer getSearchVolumeSeptember() {
        return searchVolumeSeptember;
    }

    public void setSearchVolumeSeptember(Integer searchVolumeSeptember) {
        this.searchVolumeSeptember = searchVolumeSeptember;
    }

    public Integer getSearchVolumeSeptemberTo() {
        return searchVolumeSeptemberTo;
    }

    public void setSearchVolumeSeptemberTo(Integer searchVolumeSeptemberTo) {
        this.searchVolumeSeptemberTo = searchVolumeSeptemberTo;
    }

    public Integer getSearchVolumeOctober() {
        return searchVolumeOctober;
    }

    public void setSearchVolumeOctober(Integer searchVolumeOctober) {
        this.searchVolumeOctober = searchVolumeOctober;
    }

    public Integer getSearchVolumeOctoberTo() {
        return searchVolumeOctoberTo;
    }

    public void setSearchVolumeOctoberTo(Integer searchVolumeOctoberTo) {
        this.searchVolumeOctoberTo = searchVolumeOctoberTo;
    }

    public Integer getSearchVolumeNovember() {
        return searchVolumeNovember;
    }

    public void setSearchVolumeNovember(Integer searchVolumeNovember) {
        this.searchVolumeNovember = searchVolumeNovember;
    }

    public Integer getSearchVolumeNovemberTo() {
        return searchVolumeNovemberTo;
    }

    public void setSearchVolumeNovemberTo(Integer searchVolumeNovemberTo) {
        this.searchVolumeNovemberTo = searchVolumeNovemberTo;
    }

    public Integer getSearchVolumeDecember() {
        return searchVolumeDecember;
    }

    public void setSearchVolumeDecember(Integer searchVolumeDecember) {
        this.searchVolumeDecember = searchVolumeDecember;
    }

    public Integer getSearchVolumeDecemberTo() {
        return searchVolumeDecemberTo;
    }

    public void setSearchVolumeDecemberTo(Integer searchVolumeDecemberTo) {
        this.searchVolumeDecemberTo = searchVolumeDecemberTo;
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
        operationsObject.put("searchVolumeJanuary", this.getOpSearchVolumeJanuary());
        operationsObject.put("searchVolumeFebruary", this.getOpSearchVolumeFebruary());
        operationsObject.put("searchVolumeMarch", this.getOpSearchVolumeMarch());
        operationsObject.put("searchVolumeApril", this.getOpSearchVolumeApril());
        operationsObject.put("searchVolumeMay", this.getOpSearchVolumeMay());
        operationsObject.put("searchVolumeJune", this.getOpSearchVolumeJune());
        operationsObject.put("searchVolumeJuly", this.getOpSearchVolumeJuly());
        operationsObject.put("searchVolumeAugust", this.getOpSearchVolumeAugust());
        operationsObject.put("searchVolumeSeptember", this.getOpSearchVolumeSeptember());
        operationsObject.put("searchVolumeOctober", this.getOpSearchVolumeOctober());
        operationsObject.put("searchVolumeNovember", this.getOpSearchVolumeNovember());
        operationsObject.put("searchVolumeDecember", this.getOpSearchVolumeDecember());

        // create filter object
        JSONObject filterObject = new JSONObject();
        filterObject.put("keyword", this.getKeyword());

        if (this.getGoogleResultCount() != null) {
            filterObject.put("googleResultCount", this.getGoogleResultCount().toString());
        }

        if (this.getGoogleResultCountTo() != null) {
            filterObject.put("googleResultCountTo", this.getGoogleResultCountTo().toString());
        }

        if (this.getSearchVolume() != null) {
            filterObject.put("searchVolume", this.getSearchVolume().toString());
        }

        if (this.getSearchVolumeTo() != null) {
            filterObject.put("searchVolumeTo", this.getSearchVolumeTo().toString());
        }

        if (this.getSuggestedBid() != null) {
            filterObject.put("suggestedBid", this.getSuggestedBid().toString());
        }

        if (this.getSuggestedBidTo() != null) {
            filterObject.put("suggestedBidTo", this.getSuggestedBidTo().toString());
        }

        if (this.getGoogleInTitleCount() != null) {
            filterObject.put("googleInTitleCount", this.getGoogleInTitleCount().toString());
        }

        if (this.getGoogleInTitleCountTo() != null) {
            filterObject.put("googleInTitleCountTo", this.getGoogleInTitleCountTo().toString());
        }

        if (this.getCompetition() != null) {
            filterObject.put("competition", this.getCompetition().toString());
        }

        if (this.getCompetitionTo() != null) {
            filterObject.put("competitionTo", this.getCompetitionTo().toString());
        }

        if (this.getTermCount() != null) {
            filterObject.put("termCount", this.getTermCountTo().toString());
        }

        if (this.getTermCountTo() != null) {
            filterObject.put("termCountTo", this.getTermCountTo().toString());
        }

        if (this.getSearchVolumeJanuary() != null) {
            filterObject.put("searchVolumeJanuary", this.getSearchVolumeJanuary().toString());
        }

        if (this.getSearchVolumeJanuaryTo() != null) {
            filterObject.put("searchVolumeJanuaryTo", this.getSearchVolumeJanuaryTo().toString());
        }

        if (this.getSearchVolumeFebruary() != null) {
            filterObject.put("searchVolumeFebruary", this.getSearchVolumeFebruary().toString());
        }

        if (this.getSearchVolumeFebruaryTo() != null) {
            filterObject.put("searchVolumeFebruaryTo", this.getSearchVolumeFebruaryTo().toString());
        }

        if (this.getSearchVolumeMarch() != null) {
            filterObject.put("searchVolumeMarch", this.getSearchVolumeMarch().toString());
        }

        if (this.getSearchVolumeMarchTo() != null) {
            filterObject.put("searchVolumeMarchTo", this.getSearchVolumeMarchTo().toString());
        }

        if (this.getSearchVolumeApril() != null) {
            filterObject.put("searchVolumeApril", this.getSearchVolumeApril().toString());
        }

        if (this.getSearchVolumeAprilTo() != null) {
            filterObject.put("searchVolumeAprilTo", this.getSearchVolumeAprilTo().toString());
        }

        if (this.getSearchVolumeMay() != null) {
            filterObject.put("searchVolumeMay", this.getSearchVolumeMay().toString());
        }

        if (this.getSearchVolumeMayTo() != null) {
            filterObject.put("searchVolumeMayTo", this.getSearchVolumeMayTo().toString());
        }

        if (this.getSearchVolumeJune() != null) {
            filterObject.put("searchVolumeJune", this.getSearchVolumeJune().toString());
        }

        if (this.getSearchVolumeJuneTo() != null) {
            filterObject.put("searchVolumeJuneTo", this.getSearchVolumeJuneTo().toString());
        }

        if (this.getSearchVolumeJuly() != null) {
            filterObject.put("searchVolumeJuly", this.getSearchVolumeJuly().toString());
        }

        if (this.getSearchVolumeJulyTo() != null) {
            filterObject.put("searchVolumeJulyTo", this.getSearchVolumeJulyTo().toString());
        }

        if (this.getSearchVolumeAugust() != null) {
            filterObject.put("searchVolumeAugust", this.getSearchVolumeAugust().toString());
        }

        if (this.getSearchVolumeAugustTo() != null) {
            filterObject.put("searchVolumeAugustTo", this.getSearchVolumeAugustTo().toString());
        }

        if (this.getSearchVolumeSeptember() != null) {
            filterObject.put("searchVolumeSeptember", this.getSearchVolumeSeptember().toString());
        }

        if (this.getSearchVolumeSeptemberTo() != null) {
            filterObject.put("searchVolumeSeptemberTo", this.getSearchVolumeSeptemberTo().toString());
        }

        if (this.getSearchVolumeOctober() != null) {
            filterObject.put("searchVolumeOctober", this.getSearchVolumeOctober().toString());
        }

        if (this.getSearchVolumeOctoberTo() != null) {
            filterObject.put("searchVolumeOctoberTo", this.getSearchVolumeOctoberTo().toString());
        }

        if (this.getSearchVolumeNovember() != null) {
            filterObject.put("searchVolumeNovember", this.getSearchVolumeNovember().toString());
        }

        if (this.getSearchVolumeNovemberTo() != null) {
            filterObject.put("searchVolumeNovemberTo", this.getSearchVolumeNovemberTo().toString());
        }

        if (this.getSearchVolumeDecember() != null) {
            filterObject.put("searchVolumeDecember", this.getSearchVolumeDecember().toString());
        }

        if (this.getSearchVolumeDecemberTo() != null) {
            filterObject.put("searchVolumeDecemberTo", this.getSearchVolumeDecemberTo().toString());
        }

        // add operations to filterObject
        filterObject.put("op", operationsObject);

        // create final json object for a filter request
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("filter", filterObject);
        jsonObject.put("max", this.getMax());
        jsonObject.put("listDistinct", this.getListDistinct());
        jsonObject.put("sort", this.getSort());
        jsonObject.put("order", this.getOrder());

        // add fields to get to json
        jsonObject.put("fieldsRequested", this.getFieldsToGet());

        String jsonString = jsonObject.toString();

        return jsonString;
    }
}
