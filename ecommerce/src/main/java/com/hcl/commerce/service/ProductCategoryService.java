package com.hcl.commerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.commerce.dto.ProductCategoryAddDTO;
import com.hcl.commerce.entity.ProductCategory;

@Service
public interface ProductCategoryService {

	ProductCategory getCategory(Long id);

	ProductCategory addCategory(ProductCategoryAddDTO dto);

	List<ProductCategory> getAllProductCategory();
}