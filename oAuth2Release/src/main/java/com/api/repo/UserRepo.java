package com.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.model.user.User;


public interface UserRepo extends JpaRepository<User, Long> {
	 User findByUsername(String username);
  
}

