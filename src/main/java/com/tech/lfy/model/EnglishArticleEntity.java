package com.tech.lfy.model;

public class EnglishArticleEntity {

    private  String id;
    private  String article;
    private  String expess;
    private  String state; // 状态（四级 1六级 2初中 3小学 4高中 5商务 6旅游）

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getExpess() {
        return expess;
    }

    public void setExpess(String expess) {
        this.expess = expess;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
