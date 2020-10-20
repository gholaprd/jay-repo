package com.coforge.jay.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.jay.domain.User;

@Service
public class JpaService {
	
	@Autowired
	private JPASecurityUserRepository userRepository;
	
	public User saveUser(User user) {
	
		userRepository.save(user);
		return user;
	}

}
