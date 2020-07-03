package com.sbnz.berza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbnz.berza.model.User;

public interface UserRepository extends JpaRepository<User , Long> {
	
	public User getUserByUserUsername(String username);

}
