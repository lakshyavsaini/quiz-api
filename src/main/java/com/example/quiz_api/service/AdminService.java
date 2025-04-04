package com.example.quiz_api.service;

import com.example.quiz_api.model.Admin;
import com.example.quiz_api.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin authenticate(String email, String password) throws ExecutionException, InterruptedException {
        return adminRepository.findByEmailAndPassword(email, password);
    }

    // Other admin-related methods
}