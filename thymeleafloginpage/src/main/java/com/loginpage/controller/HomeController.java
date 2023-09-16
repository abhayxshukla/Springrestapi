package com.loginpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.loginpage.entities.User;

import jakarta.validation.Valid;

@Controller
public class HomeController {
	
	//Returns template for viewing the page
	@GetMapping("/form")
	public String openForm(@ModelAttribute("User") User user) {
		return "form";
	}
	
	//handler for processing the form
	@PostMapping("/process")
	public String process(@Valid @ModelAttribute("User") User user, BindingResult result) {
		if(result.hasErrors()) {
			//displays the form again with validation errors
			return "form";
		} else {
			//displays success template
			return "success";
		}
	}
}
