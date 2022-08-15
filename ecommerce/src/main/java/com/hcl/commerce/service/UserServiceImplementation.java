package com.hcl.commerce.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.hcl.commerce.Email;
import com.hcl.commerce.dto.UserDTO;
import com.hcl.commerce.dto.UserRegistrationDTO;
import com.hcl.commerce.entity.Address;
import com.hcl.commerce.entity.User;
import com.hcl.commerce.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private JavaMailSender javaMailSender;

	
	@Override
	public User registerUser(UserRegistrationDTO dto) {
		User user = new User();
		BeanUtils.copyProperties(dto, user);
		Email.sendRegistrationMail(javaMailSender, user.getEmail(), user.getFirstName());
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

	@Override
	public User getUser(String username, String password) {
		return userRepository.findByUsernameAndPassword(username,password);
	}

	@Override
	public User updateUser(UserDTO dto) {
		User user = getUser(dto.getUserId());
		if(user != null) {
			BeanUtils.copyProperties(dto,user);
			return userRepository.save(user);
		}
		return null;
	}

	@Override
	public Set<Address> getAddress(Long id) {
		User user = getUser(id);
		return user.getAddress();
	}

}
