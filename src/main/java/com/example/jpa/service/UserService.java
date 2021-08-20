package com.example.jpa.service;

import com.example.jpa.model.User;
import com.example.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository  userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User postAllUsers(User user) {
        System.out.println("service");
        return userRepository.save(user);
    }
}
