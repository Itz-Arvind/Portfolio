package com.portfolio.model;

import java.util.List;

public class Experience {
    private final String date;
    private final String role;
    private final String company;
    private final String description;
    private final List<String> tags;

    public Experience(String date, String role, String company, String description, List<String> tags) {
        this.date = date;
        this.role = role;
        this.company = company;
        this.description = description;
        this.tags = tags;
    }

    public String getDate() {
        return date;
    }

    public String getRole() {
        return role;
    }

    public String getCompany() {
        return company;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getTags() {
        return tags;
    }
}
