package com.tech.lfy.model;

import java.util.Date;

public class EnglishClassEntity {

    private  String id;
    private  String classify;  //课程分类（1口语，2阅读）
    private  String local;     //听力语音名称
    private  String answer;    //阅读问题&听力问题
    private  String question;  //阅读文章&听力文章
    private  String reading;   //答案
    private  String state;  //状态（0四级 1六级 2初中 3小学 4高中 5商务 6旅游）
    private  Date   createTime;


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getReading() {
        return reading;
    }

    public void setReading(String reading) {
        this.reading = reading;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
