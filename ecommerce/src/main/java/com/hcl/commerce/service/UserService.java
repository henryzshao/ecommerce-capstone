package com.hcl.commerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.commerce.dto.UserDTO;
import com.hcl.commerce.entity.User;

@Service
public interface UserService {

	User registerUser(UserDTO userDto);

	User getUser(Long userId);

	User deleteUser(Long userId);

	List<User> getAllUser();

}
