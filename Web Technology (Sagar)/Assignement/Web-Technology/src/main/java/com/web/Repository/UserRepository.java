package com.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.model.UserRegistration;

@Repository
public interface UserRepository extends JpaRepository<UserRegistration, Integer>{
	public UserRegistration findByUsername(String username);
}
