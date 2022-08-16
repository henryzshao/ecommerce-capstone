package com.hcl.commerce.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductAddDTO {

	private String productName;

	private int stockCount;

	private LocalDate dateCreated;

	private LocalDate dateLastUpdated;

	private BigDecimal unitPrice;
	
	private String image_url;

	private Long category;
}
