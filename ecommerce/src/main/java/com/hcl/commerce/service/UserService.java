package com.hcl.commerce.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.hcl.commerce.dto.UserDTO;
import com.hcl.commerce.dto.UserRegistrationDTO;
import com.hcl.commerce.entity.Address;
import com.hcl.commerce.entity.User;

@Service
public interface UserService {

	User registerUser(UserRegistrationDTO dto);

	User getUser(Long userId);

	User deleteUser(Long userId);

	List<User> getAllUser();

	User getUser(String username, String password);

	User updateUser(UserDTO dto);

	Set<Address> getAddress(Long id);

}
