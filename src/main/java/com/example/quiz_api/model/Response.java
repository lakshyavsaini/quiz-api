package com.example.quiz_api.model;

import lombok.Data;

import java.util.List;
@Data
public class Response {
    private String quizId;
    private String recipientEmail;
    private List<Answer> answers;

    // getters and setters
}