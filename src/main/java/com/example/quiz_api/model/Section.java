package com.example.quiz_api.model;

import lombok.Data;

import java.util.List;
@Data
public class Section {
    private String id;
    private String name;
    private List<Question> questions;

    // getters and setters
}