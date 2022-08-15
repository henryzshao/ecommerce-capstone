package com.hcl.commerce.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.commerce.dto.AddressDTO;
import com.hcl.commerce.entity.Address;
import com.hcl.commerce.entity.User;
import com.hcl.commerce.repository.AddressRepository;

@Service
public class AddressServiceImplementation implements AddressService {

	@Autowired
	AddressRepository repo;
	
	@Autowired
	UserService serv;

	@Override
	public Address addAddress(AddressDTO dto) {
		Address address = new Address();
		BeanUtils.copyProperties(dto, address);
		return repo.save(address);
	}

	@Override
	public Address getAddress(Long id) {
		Optional<Address> address = repo.findById(id);
		if (address.isPresent()) {
			return address.get();
		}
		return null;
	}

	@Override
	public Address updateAddress(AddressDTO dto) {
		Address address = getAddress(dto.getAddressId());
		BeanUtils.copyProperties(dto, address);
		return repo.save(address);
	}

	@Override
	public Address deleteAddress(Long id) {
		Address address = getAddress(id);
		repo.delete(address);
		return address;
	}

	@Override
	public List<Address> getAllAddress() {
		return repo.findAll();
	}

	@Override
	public Set<User> getUser(Long id) {
		Address address = getAddress(id);
		//return address.getUser();
		return null;
	}

}
