package com.hcl.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.commerce.dto.product.ProductAddDTO;
import com.hcl.commerce.entity.Product;
import com.hcl.commerce.service.product.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	
	@PostMapping("product/add")
	public Product addProduct(@RequestBody ProductAddDTO dto) {
		return productService.addProduct(dto);
	}
	
	@DeleteMapping("product/delete/{id}")
	public Product deleteProduct(@PathVariable Long id) {
		return productService.deleteProduct(id);
	}
	
	@PostMapping("product/update/{id}")
	public Product updateProduct(@RequestBody ProductAddDTO dto, @PathVariable Long id) {
		return productService.updateProduct(id, dto);
	}
	
	@GetMapping("product/get/{id}")
	public Product getProduct(@PathVariable Long id) {
		return productService.getProduct(id);
	}
	
	@GetMapping("product/all")
	public List<Product> getProduct() {
		return productService.getAllProduct();
	}
	

	
}
