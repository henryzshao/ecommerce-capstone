package com.hcl.commerce.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.commerce.dto.UserDTO;
import com.hcl.commerce.dto.UserLoginDTO;
import com.hcl.commerce.dto.UserRegistrationDTO;
import com.hcl.commerce.entity.Address;
import com.hcl.commerce.entity.User;
import com.hcl.commerce.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/registration") //create
	public User registerUser(@RequestBody UserRegistrationDTO dto) {
		return userService.registerUser(dto);
	}

	@GetMapping("/admin/users/get/{userId}") //read
	public User getUser(@PathVariable Long userId) {
		return userService.getUser(userId);
	}
	
	@PostMapping("/admin/users/update")
	public User updateUser(@RequestBody UserDTO dto) {
		return userService.updateUser(dto);
	}
			
	@DeleteMapping("/admin/users/delete/{userId}") //delete
	public User deleteUser(@PathVariable Long userId) {
		return userService.deleteUser(userId);
	}

	@GetMapping("/admin/users/all")
	public List<User> getAllUsers() {
		return userService.getAllUser();
	}

	@GetMapping("/login")
	public User login(@RequestBody UserLoginDTO userLoginDto) {
		return userService.getUser(userLoginDto.getUsername(), userLoginDto.getPassword());
	}
	
	@GetMapping("/admin/user/address")
	public Set<Address> getAddress(Long id){
		return userService.getAddress(id);
	}
	
}
