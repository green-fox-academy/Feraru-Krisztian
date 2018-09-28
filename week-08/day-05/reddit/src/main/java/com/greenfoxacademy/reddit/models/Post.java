package com.greenfoxacademy.reddit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String url;
    private int rateing;

    public Post(){}

    public Post(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Post(String name, String url, int rating) {
        this.name = name;
        this.url = url;
        this.rateing = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getRateing() {
        return rateing;
    }

    public void setRateing(int rateing) {
        this.rateing = rateing;
    }
}
