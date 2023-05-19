package com.web.controller;

import com.web.Services.UserService;
import com.web.model.UserLogin;
import com.web.model.UserRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/register")
	public String userRegister(UserRegistration user) {
		System.out.println(user.toString());
		System.out.println("hyy1");
		userService.addUser(user);
		return "Login";
	}

	@PostMapping("/login")
	public String userLogin(UserLogin userLogin) {
		System.out.println("hyy2");
		UserRegistration user = userService.getUser(userLogin.getUsername());
		System.out.println(user.toString());
		return "Home";
	}
}
