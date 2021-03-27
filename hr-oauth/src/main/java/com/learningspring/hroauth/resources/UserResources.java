package com.learningspring.hroauth.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learningspring.hroauth.entities.User;
import com.learningspring.hroauth.services.UserSerivce;

@RestController
@RequestMapping( value = "/users")
public class UserResources {

	@Autowired
	private UserSerivce service;
	
	@GetMapping( value = "/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email) {
		try {
			User user = service.findByEmail(email);
			return ResponseEntity.ok(user);			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
}
