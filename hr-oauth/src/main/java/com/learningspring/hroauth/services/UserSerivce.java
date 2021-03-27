package com.learningspring.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningspring.hroauth.entities.User;
import com.learningspring.hroauth.feignclients.UserFeignClient;

@Service
public class UserSerivce {

	private static Logger logger = LoggerFactory.getLogger(UserSerivce.class);
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEmail( String email ) {
		User user = userFeignClient.findByEmail(email).getBody();
		if( user == null) {
			logger.error("Email not found: " + email);
			throw new IllegalArgumentException("Email not found.");
		}
		
		logger.info("Email found: " + email);
		
		return user;
	}
}
