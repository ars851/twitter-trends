package com.company.model;

import java.time.LocalDate;

public class Tweet {

    private String tweetContent;
    private Double latitude;
    private Double longitude;
    private LocalDate date;
    private Float tweetWeight;
    private String stateName;

    public Tweet(String tweetContent, Double latitude, Double longitude, LocalDate date) {
        this.tweetContent = tweetContent;
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
    }

    public String getTweetContent() {
        return tweetContent;
    }

    public void setTweetContent(String tweetContent) {
        this.tweetContent = tweetContent;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Float getTweetWeight() {
        return tweetWeight;
    }

    public void setTweetWeight(Float tweetWeight) {
        this.tweetWeight = tweetWeight;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
