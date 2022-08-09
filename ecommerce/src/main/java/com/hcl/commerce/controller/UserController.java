package com.hcl.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.commerce.dto.UserDTO;
import com.hcl.commerce.entity.User;
import com.hcl.commerce.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;


	@PostMapping("/register")
	public User registerUser(@RequestBody UserDTO userDto) {
		return userService.registerUser(userDto);
	}

	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable Long userId) {
		return userService.getUser(userId);
	}

	@DeleteMapping("/delete/{userId}")
	public User deleteUser(@PathVariable Long userId) {
		return userService.deleteUser(userId);
	}
	
	@GetMapping("/users/all")
	public List<User> getAllUsers() {
		return userService.getAllUser();
	}
}