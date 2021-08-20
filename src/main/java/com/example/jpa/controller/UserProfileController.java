package com.example.jpa.controller;

import com.example.jpa.model.User;
import com.example.jpa.model.UserProfile;
import com.example.jpa.service.UserProfileService;
import com.example.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserProfileController {

    @Autowired
    UserProfileService userProfileService;

    @GetMapping("/get2")
    public List<UserProfile> getAllUsers() {
        return userProfileService .getAllUsers();
    }

    @PostMapping("/post2")
    public UserProfile postAllUsers(@RequestBody UserProfile userProfile) {
        System.out.println("controller");
        return userProfileService.postAllUsers(userProfile);
    }
}
