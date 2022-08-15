package com.hcl.commerce.dto;

import lombok.Data;

@Data
public class AddressDTO {

	private Long addressId;

	private String street;

	private String secondary;

	private String city;

	private String state;

	private String country;

	private int zip;

	
}
