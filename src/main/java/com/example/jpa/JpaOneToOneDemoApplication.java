package com.example.jpa;



import com.example.jpa.model.User;
import com.example.jpa.model.UserProfile;
import com.example.jpa.repository.UserProfileRepository;
import com.example.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class JpaOneToOneDemoApplication {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserProfileRepository userProfileRepository;

	public static void main(String[] args) {

		SpringApplication.run(JpaOneToOneDemoApplication.class, args);
	}

//	@Override
//	public void run(String[] args) throws Exception {
//		//clean up database tables
//		userProfileRepository.deleteAllInBatch();
//		userRepository.deleteAllInBatch();
//
//		//create a user instance
//		User user = new User("Subhranshu Mishra", "Mishra", "mishrasubhranshu2@gmail.com",
//				"MY_Password");
//
//		UserProfile userProfile = new UserProfile(1,"7978693552", Gender.MALE, "10/01/1997",
//				"Salipur", "Odisha", "India", "754202");
//
//		user.setUserprofile(userProfile);
//		userRepository.save(user);
//	}

	}

