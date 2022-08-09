package com.hcl.commerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address")
@Setter
@Getter
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addressId;

	private String street;
	
	private String secondary;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private int zip;
}
