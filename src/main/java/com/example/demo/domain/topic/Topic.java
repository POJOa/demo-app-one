package com.example.demo.domain.topic;

public class Topic {
    private String title;
    private String content;

    public Topic(String title, String content){
        this.content = content;
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public Topic setContent(final String content) {
        this.content = content;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Topic setTitle(final String title) {
        this.title = title;
        return this;
    }
}
