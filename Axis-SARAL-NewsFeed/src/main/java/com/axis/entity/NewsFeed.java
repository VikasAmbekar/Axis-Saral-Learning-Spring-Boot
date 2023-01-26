package com.axis.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class NewsFeed {
    @Id
    @Column(name = "NewsId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long newsFeedId;

    private String newsName;
    private String newsImageUrl;
    private String newsComment;
    private String employeeName;

    public NewsFeed() {
    }

    public NewsFeed(String newsName, String newsImageUrl, String newsComment, String employeeName) {
        this.newsName = newsName;
        this.newsImageUrl = newsImageUrl;
        this.newsComment = newsComment;
        this.employeeName = employeeName;
    }

    public long getNewsFeedId() {
        return newsFeedId;
    }

    public void setNewsFeedId(long newsFeedId) {
        this.newsFeedId = newsFeedId;
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }

    public String getNewsImageUrl() {
        return newsImageUrl;
    }

    public void setNewsImageUrl(String newsImageUrl) {
        this.newsImageUrl = newsImageUrl;
    }

    public String getNewsComment() {
        return newsComment;
    }

    public void setNewsComment(String newsComment) {
        this.newsComment = newsComment;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "NewsFeed{" +
                "newsFeedId=" + newsFeedId +
                ", newsName='" + newsName + '\'' +
                ", newsImageUrl='" + newsImageUrl + '\'' +
                ", newsComment='" + newsComment + '\'' +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewsFeed newsFeed)) return false;
        return getNewsFeedId() == newsFeed.getNewsFeedId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNewsFeedId());
    }
}
