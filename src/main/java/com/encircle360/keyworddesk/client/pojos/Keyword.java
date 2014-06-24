package com.encircle360.keyworddesk.client.pojos;

import java.io.Serializable;

/**
 * Keyword POJO. This class represents a keyword with its data.
 *
 * @author <a href="mailto:p.huetter@encircle360.com">Patrick Huetter</a>
 */
public class Keyword implements Serializable {

    private String keyword;
    private Long searchVolume;
    private Double suggestedBid;
    private Long googleResultCount;
    private Long googleInTitleCount;
    private Integer competition;
    private Long searchVolumeJanuary;
    private Long searchVolumeFebruary;
    private Long searchVolumeMarch;
    private Long searchVolumeApril;
    private Long searchVolumeMay;
    private Long searchVolumeJune;
    private Long searchVolumeJuly;
    private Long searchVolumeAugust;
    private Long searchVolumeSeptember;
    private Long searchVolumeOctober;
    private Long searchVolumeNovember;
    private Long searchVolumeDecember;

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

    public Long getSearchVolumeJanuary() {
        return searchVolumeJanuary;
    }

    public void setSearchVolumeJanuary(Long searchVolumeJanuary) {
        this.searchVolumeJanuary = searchVolumeJanuary;
    }

    public Long getSearchVolumeFebruary() {
        return searchVolumeFebruary;
    }

    public void setSearchVolumeFebruary(Long searchVolumeFebruary) {
        this.searchVolumeFebruary = searchVolumeFebruary;
    }

    public Long getSearchVolumeMarch() {
        return searchVolumeMarch;
    }

    public void setSearchVolumeMarch(Long searchVolumeMarch) {
        this.searchVolumeMarch = searchVolumeMarch;
    }

    public Long getSearchVolumeApril() {
        return searchVolumeApril;
    }

    public void setSearchVolumeApril(Long searchVolumeApril) {
        this.searchVolumeApril = searchVolumeApril;
    }

    public Long getSearchVolumeMay() {
        return searchVolumeMay;
    }

    public void setSearchVolumeMay(Long searchVolumeMay) {
        this.searchVolumeMay = searchVolumeMay;
    }

    public Long getSearchVolumeJune() {
        return searchVolumeJune;
    }

    public void setSearchVolumeJune(Long searchVolumeJune) {
        this.searchVolumeJune = searchVolumeJune;
    }

    public Long getSearchVolumeJuly() {
        return searchVolumeJuly;
    }

    public void setSearchVolumeJuly(Long searchVolumeJuly) {
        this.searchVolumeJuly = searchVolumeJuly;
    }

    public Long getSearchVolumeAugust() {
        return searchVolumeAugust;
    }

    public void setSearchVolumeAugust(Long searchVolumeAugust) {
        this.searchVolumeAugust = searchVolumeAugust;
    }

    public Long getSearchVolumeSeptember() {
        return searchVolumeSeptember;
    }

    public void setSearchVolumeSeptember(Long searchVolumeSeptember) {
        this.searchVolumeSeptember = searchVolumeSeptember;
    }

    public Long getSearchVolumeOctober() {
        return searchVolumeOctober;
    }

    public void setSearchVolumeOctober(Long searchVolumeOctober) {
        this.searchVolumeOctober = searchVolumeOctober;
    }

    public Long getSearchVolumeNovember() {
        return searchVolumeNovember;
    }

    public void setSearchVolumeNovember(Long searchVolumeNovember) {
        this.searchVolumeNovember = searchVolumeNovember;
    }

    public Long getSearchVolumeDecember() {
        return searchVolumeDecember;
    }

    public void setSearchVolumeDecember(Long searchVolumeDecember) {
        this.searchVolumeDecember = searchVolumeDecember;
    }
}
