package com.hcl.commerce.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.hcl.commerce.dto.AddressDTO;
import com.hcl.commerce.entity.Address;
import com.hcl.commerce.entity.User;

@Service
public interface AddressService {

	Address addAddress(AddressDTO dto);

	Address getAddress(Long id);

	Address updateAddress(AddressDTO dto);

	Address deleteAddress(Long id);

	List<Address> getAllAddress();

	Set<User> getUser(Long id);

}
