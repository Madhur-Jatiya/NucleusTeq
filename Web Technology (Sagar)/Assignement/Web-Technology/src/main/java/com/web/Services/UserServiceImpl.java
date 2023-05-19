package com.web.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Repository.UserRepository;
import com.web.model.UserRegistration;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void addUser(UserRegistration user) {
		userRepository.save(user);
	}

	@Override
	public UserRegistration getUser(String username) {
		return userRepository.findByUsername(username);
	}
}
