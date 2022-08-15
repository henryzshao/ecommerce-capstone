package com.hcl.commerce.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
	private Long productId;
	
	private String productName;
	
	private int stockCount;
	
	private Date dateCreated;
	
	private Date dateLastUpdated;
	
	private BigDecimal unitPrice;

    private Long category;
}
