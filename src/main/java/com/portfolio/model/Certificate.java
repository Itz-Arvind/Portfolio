package com.portfolio.model;

public class Certificate {
    private final String title;
    private final String issuer;
    private final String date;
    private final String pdfPath;

    public Certificate(String title, String issuer, String date, String pdfPath) {
        this.title = title;
        this.issuer = issuer;
        this.date = date;
        this.pdfPath = pdfPath;
    }

    public String getTitle() {
        return title;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getDate() {
        return date;
    }

    public String getPdfPath() {
        return pdfPath;
    }
}
