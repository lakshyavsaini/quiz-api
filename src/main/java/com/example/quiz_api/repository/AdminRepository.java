package com.example.quiz_api.repository;
import com.example.quiz_api.model.Admin;
import com.google.firebase.cloud.FirestoreClient;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ExecutionException;
import java.util.List;

@Repository
public class AdminRepository {

    private static final String COLLECTION_NAME = "admins";

    public Admin findByEmailAndPassword(String email, String password) throws ExecutionException, InterruptedException {
        Firestore firestore = FirestoreClient.getFirestore();
        Query query = firestore.collection(COLLECTION_NAME)
                .whereEqualTo("email", email)
                .whereEqualTo("password", password);
        QuerySnapshot querySnapshot = query.get().get();

        List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
        if (documents.isEmpty()) {
            return null;
        } else {
            return documents.get(0).toObject(Admin.class);
        }
    }

    public void saveAdmin(Admin admin) throws ExecutionException, InterruptedException {
        Firestore firestore = FirestoreClient.getFirestore();
        firestore.collection(COLLECTION_NAME).document(admin.getId()).set(admin).get();
    }

    // Other CRUD methods if needed
}