package com.hcl.commerce.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductUpdateDTO {
	private Long productId;
	
	private String productName;
	
	private int stockCount;
	
	private Date dateCreated;
	
	private Date dateLastUpdated;

    private Long category;
}
