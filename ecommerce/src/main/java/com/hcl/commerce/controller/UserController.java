package com.hcl.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.commerce.dto.user.UserInputDTO;
import com.hcl.commerce.dto.user.UserLoginDTO;
import com.hcl.commerce.entity.User;
import com.hcl.commerce.service.user.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("user/registration")
	public User registerUser(@RequestBody UserInputDTO dto) {
		return userService.registerUser(dto);
	}

	@GetMapping("user/get/{userId}") //read
	public User getUser(@PathVariable Long userId) {
		return userService.getUser(userId);
	}
	
	@PostMapping("user/update/{userId}")
	public User updateUser(@PathVariable Long userId, @RequestBody UserInputDTO dto) {
		return userService.updateUser(userId, dto);
	}
			
	@DeleteMapping("user/delete/{userId}") //delete
	public User deleteUser(@PathVariable Long userId) {
		return userService.deleteUser(userId);
	}

	@GetMapping("user/all")
	public List<User> getAllUsers() {
		return userService.getAllUser();
	}

	@PostMapping("user/login")
	public User loginUser(@RequestBody UserLoginDTO dto) {
		return userService.getUser(dto.getUsername(), dto.getPassword());
	}
	
}
