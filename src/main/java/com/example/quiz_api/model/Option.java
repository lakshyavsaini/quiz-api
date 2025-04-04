package com.example.quiz_api.model;

import lombok.Getter;
import lombok.Setter;


public class Option {
    private String id;
    private String text;
    private float weightage;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public float getWeightage() {
        return weightage;
    }

    public void setWeightage(float weightage) {
        this.weightage = weightage;
    }
}