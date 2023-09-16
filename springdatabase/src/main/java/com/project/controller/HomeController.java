package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.project.dao.UserRepository;
import com.project.entities.User;

@Controller
public class HomeController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/home")
	public String home(Model model) {
		return "home";
	}
	
	@GetMapping("/signup")
	public String signUp(Model model) {
		model.addAttribute("user", new User());
		return "signup";
	}
	
	@PostMapping("/register")
	public void register(@ModelAttribute User user, Model model) {
		User newUser = new User();
		newUser = this.userRepository.save(user);
	}
}
