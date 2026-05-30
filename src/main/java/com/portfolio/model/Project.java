package com.portfolio.model;

public class Project {
    private final String title;
    private final String description;
    private final String tags;
    private final String url;

    public Project(String title, String description, String tags, String url) {
        this.title = title;
        this.description = description;
        this.tags = tags;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getTags() {
        return tags;
    }

    public String getUrl() {
        return url;
    }
}
