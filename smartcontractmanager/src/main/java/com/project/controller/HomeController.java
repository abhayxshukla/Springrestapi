package com.project.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;
import com.project.entities.User;
import com.project.service.userService;

@Controller
public class HomeController {	
	@Autowired
	private userService UserService;
	
	//handler for displaying home page 
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("title", "Home Page");
		return "home";
	}
	
	//handler for displaying Sign up page
	@GetMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title", "Register");
		model.addAttribute("user", new User());
		return "signup";
	}
	
	//handler for processing the Sign up form
	@PostMapping("/register")
	public String register(@ModelAttribute("user") User user, @RequestParam(value="agreement", defaultValue = "false") boolean agreement, Model model) {
		user.setEnabled(true);
		System.out.println("Agreement " + agreement);
		System.out.println("User " + user);
		UserService.registerUser(user);
		
		return "register";
	}
	
	
	
}
