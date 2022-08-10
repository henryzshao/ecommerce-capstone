package com.hcl.commerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.commerce.dto.ProductCategoryAddDTO;
import com.hcl.commerce.entity.ProductCategory;
import com.hcl.commerce.repository.ProductCategoryRepository;

@Service
public class ProductCategoryServiceImplementation implements ProductCategoryService{

	@Autowired
	ProductCategoryRepository productCategoryRepository;
	
	@Override
	public ProductCategory getCategory(Long id) {
		Optional<ProductCategory> productCategory = productCategoryRepository.findById(id);
		if (productCategory.isPresent()) {
			return productCategory.get();
		}
		return null;
	}

	@Override
	public ProductCategory addCategory(ProductCategoryAddDTO dto) {
		ProductCategory category = new ProductCategory();
		BeanUtils.copyProperties(dto, category);
		return productCategoryRepository.save(category);
	}

	@Override
	public List<ProductCategory> getAllProductCategory() {
		return productCategoryRepository.findAll();
	}

}
