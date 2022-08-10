package com.hcl.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.commerce.dto.ProductCategoryAddDTO;
import com.hcl.commerce.entity.ProductCategory;
import com.hcl.commerce.service.ProductCategoryService;

@RestController
public class ProductCategoryController {
	@Autowired
	ProductCategoryService productCategoryService;
	
	@PostMapping("/admin/productcategory/add")
	public ProductCategory addCategory(@RequestBody ProductCategoryAddDTO dto) {
		return productCategoryService.addCategory(dto);
	}
	
	@GetMapping("/admin/productcategory/all")
	public List<ProductCategory> allCategory() {
		return productCategoryService.getAllProductCategory();
	}

	
}
