package com.example.quiz_api.model;

import lombok.Getter;
import lombok.Setter;


public class Answer {
    private String questionId;
    private String answerText;

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }
}