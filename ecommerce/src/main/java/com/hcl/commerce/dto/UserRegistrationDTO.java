package com.hcl.commerce.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegistrationDTO {
	private Long userId;
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
}
