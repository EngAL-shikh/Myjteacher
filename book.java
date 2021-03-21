package com.example.myteacher;

public class book {
    int idbook;
    String title;
    String content;
    String level_number;

    public book(int idbook, String title, String content, String level_number) {
        this.idbook = idbook;
        this.title = title;
        this.content = content;
        this.level_number = level_number;
    }

    public int getIdbook() {
        return idbook;
    }

    public void setIdbook(int idbook) {
        this.idbook = idbook;
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

    public String getLevel_number() {
        return level_number;
    }

    public void setLevel_number(String level_number) {
        this.level_number = level_number;
    }
}