package com.hcl.commerce.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

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
@Table(name = "product")
@Getter
@Setter
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	
	private String productName;
	
	private int stockCount;
	
	private LocalDate dateCreated;
	
	private LocalDate dateLastUpdated;
	
	private BigDecimal unitPrice;
	
	private String image_url;
	
	@ManyToOne
    @JoinColumn(name = "categoryId")
    private ProductCategory category;
}
