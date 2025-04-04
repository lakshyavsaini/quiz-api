package com.example.quiz_api.service;

import com.example.quiz_api.model.Quiz;
import com.example.quiz_api.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    public String createQuiz(Quiz quiz) throws ExecutionException, InterruptedException {
        return quizRepository.saveQuiz(quiz);
    }

    // Other quiz-related methods
}