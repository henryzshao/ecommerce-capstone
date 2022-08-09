package com.hcl.commerce.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
	private Long userId;
	private String firstName;
	private String lastName;
	private String cell;
	private String email;
}
