package com.example.quiz_api.model;

import lombok.Data;

import java.util.List;
@Data
public class Question {
    private String id;
    private String text;
    private int weightage;
    private boolean isNegative;
    private List<Option> options;

    // getters and setters
}