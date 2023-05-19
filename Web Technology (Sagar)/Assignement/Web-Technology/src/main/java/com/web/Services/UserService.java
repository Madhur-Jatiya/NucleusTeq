package com.web.Services;

import org.springframework.stereotype.Service;

import com.web.model.UserRegistration;
@Service
public interface UserService {
	public void addUser(UserRegistration user);
	public UserRegistration getUser(String username);
}
