package com.edu.pk.gulehri.meraallah.model;

public class Videos {

    private int id;
    private String title, url;

    public Videos(int id, String title, String url) {
        this.id = id;
        this.title = title;
        this.url = url;
    }

    public Videos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
