package com.coforge.jay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.jay.domain.User;
import com.coforge.jay.repository.JpaService;

@RestController
@RequestMapping("/secure/rest")
public class JPASecurityController {
	
	@Autowired
	private JpaService userRepository;
	
	@Bean 
	public JpaService getJpaService() {
		return new JpaService();
	}
	
	@Autowired
	private BCryptPasswordEncoder passEncoder;
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		String password = user.getPassword();
		String encodePwd = passEncoder.encode(password);
		user.setPassword(encodePwd);
		userRepository.saveUser(user);
		return user;
	}
	
	@GetMapping("/msg")
	public String getMessage() {
		
		return "Good Morning";
		
	}
	
	
}
