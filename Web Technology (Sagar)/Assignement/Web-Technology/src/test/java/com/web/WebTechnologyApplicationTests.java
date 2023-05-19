package com.web;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.web.model.UserRegistration;

@SpringBootTest
class WebTechnologyApplicationTests {

	UserRegistration user = new UserRegistration();

	@Test
	void user() {
		assertNotNull(user.getUsername());
	}

}
