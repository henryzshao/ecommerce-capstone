package com.hcl.commerce.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "user_address", joinColumns = { @JoinColumn(name = "address_id") }, inverseJoinColumns = {
			@JoinColumn(name = "user_id") })
	private Set<Address> address = new HashSet<>();
}
