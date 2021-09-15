package com.example.jpa.controller;

import com.example.jpa.model.User;
import com.example.jpa.model.UserProfile;
import com.example.jpa.repository.UserProfileRepository;
import com.example.jpa.repository.UserRepository;
import com.example.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserProfileRepository userProfileRepository;

    @GetMapping("/get")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/post")
    public User postAllUsers(@RequestBody User user) {
        System.out.println("controller");
        return userService.postAllUsers(user);
    }

    @PutMapping("/user/{id}")
    public User updateEmployee(@RequestBody User user,@PathVariable long id) {
        return userRepository.findById(id)
                .map(user1 -> {
                    user1.setFirstName(user.getFirstName());
                    user1.setLastName(user.getLastName());
                    user1.setEmail(user.getEmail());
                    return userRepository.save(user1);
                })
                .orElseGet(() -> {
                    user.setId(id);
                    return userRepository.save(user);
                });
    }

    @PutMapping("/userProfile/{id}")
    public UserProfile updateEmployee(@RequestBody UserProfile userProfile,@PathVariable long id) {
        return userProfileRepository.findById(id)
                .map(user1 -> {
                    user1.setAddress(userProfile.getAddress());
                    user1.setDateOfBirth(userProfile.getDateOfBirth());
                    user1.setPhoneNumber(userProfile.getPhoneNumber()); ;
                    return userProfileRepository.save(user1);
                })
                .orElseGet(() -> {
                    userProfile.setId(id);
                    return userProfileRepository.save(userProfile);
                });
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable long id) {
         userRepository.deleteById(id);
        return "deleted successfully "+id;

    }
}
