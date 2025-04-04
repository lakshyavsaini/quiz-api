package com.example.quiz_api.controller;

import com.example.quiz_api.model.Response;
import com.example.quiz_api.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("/submitResponse")
    public String submitResponse(@RequestBody Response response) {
        // Save response logic
        return "Response submitted successfully";
    }

    // Other quiz-related endpoints
}