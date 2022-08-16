package com.hcl.commerce.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductUpdateDTO {
	private Long productId;

	private String productName;

	private int stockCount;

	private LocalDate dateLastUpdated;

	private BigDecimal unitPrice;
	
	private String image_url;

	private Long category;
}
