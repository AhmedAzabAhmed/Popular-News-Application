package com.example.popularnewsapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class News {
    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("totalResults")
    @Expose
    private int totalResult;

    @SerializedName("articles")
    @Expose
    private List<Article> articles;

    public String getStatus() {
        return status;
    }

    public int getTotalResult() {
        return totalResult;
    }

    public List<Article> getArticles() {
        return articles;
    }
}
