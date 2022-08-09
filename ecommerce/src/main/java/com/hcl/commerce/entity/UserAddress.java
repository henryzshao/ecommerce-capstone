package com.hcl.commerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_address")
@Setter
@Getter
public class UserAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userAddressId;
	
	@ManyToOne
    @JoinColumn(name = "addressId")
	private Address address;

	@ManyToOne
    @JoinColumn(name = "userId")
	private User user;
}
