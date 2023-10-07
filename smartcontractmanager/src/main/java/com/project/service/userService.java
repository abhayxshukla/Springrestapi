package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.UserRepository;
import com.project.entities.User;

@Service
public class userService {
	@Autowired
	private UserRepository userRepository;
	//saving user to database
	public void registerUser(User user) {
		userRepository.save(user);
	}
}
