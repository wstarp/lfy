package com.tech.lfy.model;
import java.io.Serializable;

public class EnglishTestEntity implements Serializable{
    private String id;
    private String testid;
    private String question;
    private String testtype;
    private String answera;
    private String answerb;
    private String answerc;
    private String answerd;
    private String answertrue;
    private String testkey;
    private Integer questionno;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTestid() {
        return testid;
    }

    public void setTestid(String testid) {
        this.testid = testid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getTesttype() {
        return testtype;
    }

    public void setTesttype(String testtype) {
        this.testtype = testtype;
    }

    public String getAnswera() {
        return answera;
    }

    public void setAnswera(String answera) {
        this.answera = answera;
    }

    public String getAnswerb() {
        return answerb;
    }

    public void setAnswerb(String answerb) {
        this.answerb = answerb;
    }

    public String getAnswerc() {
        return answerc;
    }

    public void setAnswerc(String answerc) {
        this.answerc = answerc;
    }

    public String getAnswerd() {
        return answerd;
    }

    public void setAnswerd(String answerd) {
        this.answerd = answerd;
    }

    public String getAnswertrue() {
        return answertrue;
    }

    public void setAnswertrue(String answertrue) {
        this.answertrue = answertrue;
    }

    public String getTestkey() {
        return testkey;
    }

    public void setTestkey(String testkey) {
        this.testkey = testkey;
    }

    public Integer getQuestionno() {
        return questionno;
    }

    public void setQuestionno(Integer questionno) {
        this.questionno = questionno;
    }
}
