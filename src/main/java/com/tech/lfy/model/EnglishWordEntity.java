package com.tech.lfy.model;
import java.io.Serializable;

public class EnglishWordEntity implements Serializable{
    private String id;
    private String word;
    private String soundmark;
    private String mean;
    private String NNNmean;
    private String phrase;
    private String dictionary;
    private String sentence;
    private String pron;
    private String state;
    private String statetwo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getSoundmark() {
        return soundmark;
    }

    public void setSoundmark(String soundmark) {
        this.soundmark = soundmark;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public String getNNNmean() {
        return NNNmean;
    }

    public void setNNNmean(String NNNmean) {
        this.NNNmean = NNNmean;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getDictionary() {
        return dictionary;
    }

    public void setDictionary(String dictionary) {
        this.dictionary = dictionary;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getPron() {
        return pron;
    }

    public void setPron(String pron) {
        this.pron = pron;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatetwo() {
        return statetwo;
    }

    public void setStatetwo(String statetwo) {
        this.statetwo = statetwo;
    }
}
