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
@Table(name = "shopping_cart")
@Getter
@Setter
public class ShoppingCart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long shoppingCartId;
	
	@ManyToOne
    @JoinColumn(name = "orderId")
	private Order order;

	@ManyToOne
    @JoinColumn(name = "productId")
	private Product product;
	
	private int product_quantity;
}
