package com.hcl.commerce.dto;

import lombok.Data;

@Data
public class OrderDTO {
	private Long orderId;

	private String status;

	private Long userId;
}
