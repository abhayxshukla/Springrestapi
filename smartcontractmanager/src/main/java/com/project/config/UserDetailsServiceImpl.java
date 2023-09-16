package com.project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.project.dao.UserRepository;
import com.project.entities.User;

public class UserDetailsServiceImpl implements UserDetailsService {
	//fetching user from database
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//fetching user from database
		User user = userRepository.getUserbyEmail(username);
		if(user==null) {
			throw new UsernameNotFoundException("Could not find user!");
		}
		
		CustomUserDetails customUserDetails = new CustomUserDetails(user);
		return customUserDetails;
	}

}
