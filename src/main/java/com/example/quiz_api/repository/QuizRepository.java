package com.example.quiz_api.repository;

import com.example.quiz_api.model.Quiz;
import com.google.firebase.cloud.FirestoreClient;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.DocumentReference;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ExecutionException;

@Repository
public class QuizRepository {

    private static final String COLLECTION_NAME = "quizzes";

    public String saveQuiz(Quiz quiz) throws ExecutionException, InterruptedException {
        Firestore firestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = firestore.collection(COLLECTION_NAME).document();
        quiz.setId(documentReference.getId());
        documentReference.set(quiz).get();
        return documentReference.getId();
    }

    // Other CRUD methods
}