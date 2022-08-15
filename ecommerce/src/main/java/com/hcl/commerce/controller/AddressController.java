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

import com.hcl.commerce.dto.AddressDTO;
import com.hcl.commerce.entity.Address;
import com.hcl.commerce.entity.User;
import com.hcl.commerce.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService serv;
	
	@PostMapping("admin/address/add")
	public Address addAddress(@RequestBody AddressDTO dto) {
		return serv.addAddress(dto);
	}
	
	@GetMapping("admin/address/get/{id}")
	public Address getAddress(@PathVariable Long id) {
		return serv.getAddress(id);
	}
	
	@PostMapping("admin/address/update")
	public Address updateAddress(@RequestBody AddressDTO dto) {
		return serv.updateAddress(dto);
	}
	
	@DeleteMapping("admin/address/delete/{id}")
	public Address deleteAddress(@PathVariable Long id) {
		return serv.deleteAddress(id);
	}
	
	@GetMapping("admin/address/all")
	public List<Address> allAddress(){
		return serv.getAllAddress();
	}
	
	@GetMapping("admin/address/user")
	public Set<User> getUser(@PathVariable Long id) {
		return serv.getUser(id);
	}
	
}
