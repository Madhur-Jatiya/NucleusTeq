package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserRegistration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fullname;
	private String username;
	private String email;
	private String mobile;
	private String password;
	private String gender;

	public UserRegistration(String fullname, String username, String email, String mobile, String password,
			String gender) {
		this.fullname = fullname;
		this.username = username;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.gender = gender;
	}

	public UserRegistration() {
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [fullname=" + fullname + ", username=" + username + ", email=" + email + ", mobile=" + mobile
				+ ", password=" + password  + ", gender=" + gender + "]";
	}
}
