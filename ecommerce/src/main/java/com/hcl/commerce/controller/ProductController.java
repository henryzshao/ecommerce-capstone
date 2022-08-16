package com.hcl.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.commerce.dto.ProductAddDTO;
import com.hcl.commerce.dto.ProductUpdateDTO;
import com.hcl.commerce.entity.Product;
import com.hcl.commerce.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	
	@PostMapping("/admin/product/add")
	public Product addProduct(@RequestBody ProductAddDTO dto) {
		return productService.addProduct(dto);
	}
	
	@DeleteMapping("/admin/product/delete/{id}")
	public Product deleteProduct(@PathVariable Long id) {
		return productService.deleteProduct(id);
	}
	
	@PostMapping("/admin/product/update")
	public Product updateProduct(@RequestBody ProductUpdateDTO dto) {
		return productService.updateProduct(dto);
	}
	
	@GetMapping("/user/product/get/{id}")
	public Product getProduct(@PathVariable Long id) {
		return productService.getProduct(id);
	}
	
	@GetMapping("/user/product/all")
	public List<Product> getProduct() {
		return productService.getAllProduct();
	}
	

	
}
