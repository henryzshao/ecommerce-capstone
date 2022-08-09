package com.hcl.commerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.commerce.dto.UserDTO;
import com.hcl.commerce.entity.User;
import com.hcl.commerce.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User registerUser(UserDTO userDto) {
		User user = new User();
		BeanUtils.copyProperties(userDto, user);
		return userRepository.save(user);
	}

	@Override
	public User getUser(Long userId) {
		Optional<User> user = userRepository.findById(userId);
		if (user.isPresent()) {
			return user.get();
		}
		return null;
	}

	@Override
	public User deleteUser(Long userId) {
		User user = getUser(userId);
		userRepository.delete(user);
		return user;
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

}
