package com.example.jpa.controller;

import com.example.jpa.model.User;
import com.example.jpa.model.UserProfile;
import com.example.jpa.repository.UserProfileRepository;
import com.example.jpa.service.UserProfileService;
import com.example.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserProfileController {

    @Autowired
    UserProfileService userProfileService;

    @Autowired
    UserProfileRepository userProfileRepository;

    @GetMapping("/get2")
    public List<UserProfile> getAllUsers() {
        return userProfileService .getAllUsers();
    }

    @PostMapping("/post2")
    public UserProfile postAllUsers(@RequestBody UserProfile userProfile) {
        System.out.println("controller");
        return userProfileService.postAllUsers(userProfile);
    }

    @DeleteMapping("/delete2/{id}")
    public String deleteEmployee(@PathVariable long id) {
        userProfileRepository.deleteById(id);
        return "deleted successfully "+id;

    }
}
