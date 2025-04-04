package com.example.quiz_api.model;

import lombok.Data;

import java.util.List;
@Data
public class Quiz {
    private String id;
    private String title;
    private List<Section> sections;
    private String timer;
    private String deadline;
    private String recipientEmail;

    // getters and setters
}