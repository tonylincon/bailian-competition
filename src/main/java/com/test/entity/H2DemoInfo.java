package com.test.entity;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity
public class H2DemoInfo {

    @Id
    @GeneratedValue
    private long id;

    private String title;

    private String content;

    public H2DemoInfo() {

    }

    public H2DemoInfo(String title, String content) {

       this.title = title;
       this.content = content;

    }

    public long getId() {
       return id;
    }

    public void setId(long id) {
       this.id = id;
    }

    public String getTitle() {
       return title;
    }

    public void setTitle(String title) {
       this.title = title;
    }

    public String getContent() {
       return content;
    }

    public void setContent(String content) {
       this.content = content;
    }

}