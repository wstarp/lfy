package com.tech.lfy.model;

public class EnglishArticleEntity {
/*
 `id` varchar(255) NOT NULL,
  `article` text CHARACTER SET utf8 COMMENT '文章',
  `state` varchar(255) CHARACTER SET
 */
    private  String id;
    private  String article;
    private  String state;
//ID
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
//文章
    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }
//状态（四级 1六级 2初中 3小学 4高中 5商务 6旅游）
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
