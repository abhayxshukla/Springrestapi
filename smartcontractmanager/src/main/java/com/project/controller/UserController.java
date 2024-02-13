package com.project.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.dao.UserRepository;
import com.project.entities.User;

@Controller
@RequestMapping("/login")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public String loginPage() {
		return "login";
	}
	
}
