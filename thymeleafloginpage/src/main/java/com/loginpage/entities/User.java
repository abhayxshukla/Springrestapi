package com.loginpage.entities;

import javax.validation.constraints.AssertTrue;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class User {
	
	
   @NotBlank(message="username cannot be empty!")
	private String username;
   
   @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "enter valid email")
	private String email;
   
   @AssertTrue(message = "please agree terms and conditions")
   private boolean agreed;
	
	public boolean isAgreed() {
	return agreed;
	}
	
	

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}



	public User(String username, String email) {
		super();
		this.username = username;
		this.email = email;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public User() {
		super();
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + "]";
	}
	
}
