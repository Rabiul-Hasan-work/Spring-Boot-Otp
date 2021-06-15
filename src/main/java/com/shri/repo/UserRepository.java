package com.shri.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shri.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	 User findByUsername(String username);

}
