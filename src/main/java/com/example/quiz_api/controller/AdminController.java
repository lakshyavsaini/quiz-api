package com.example.quiz_api.controller;

import com.example.quiz_api.model.Quiz;
import com.example.quiz_api.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private QuizService quizService;

    @PostMapping("/createQuiz")
    public String createQuiz(@RequestBody Quiz quiz) throws ExecutionException, InterruptedException {
        return quizService.createQuiz(quiz);
    }


}