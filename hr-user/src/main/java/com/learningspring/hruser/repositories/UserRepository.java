package com.learningspring.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningspring.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
}
