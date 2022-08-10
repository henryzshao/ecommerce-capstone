package com.hcl.commerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.commerce.dto.ProductAddDTO;
import com.hcl.commerce.dto.ProductUpdateDTO;
import com.hcl.commerce.entity.Product;
import com.hcl.commerce.repository.ProductRepository;

@Service
public class ProductServiceImplementation implements ProductService{
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ProductCategoryService productCategoryService;

	@Override
	public Product addProduct(ProductAddDTO dto) {
		Product product = new Product();
		BeanUtils.copyProperties(dto, product);
		product.setCategory(productCategoryService.getCategory(dto.getCategory()));
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product getProduct(Long id) {
		Optional<Product> product = productRepository.findById(id);
		if (product.isPresent()) {
			return product.get();
		}
		return null;
	}

	@Override
	public Product updateProduct(ProductUpdateDTO dto) {
		Product product = getProduct(dto.getProductId());
		BeanUtils.copyProperties(dto, product);
		product.setCategory(productCategoryService.getCategory(dto.getCategory()));
		return productRepository.save(product);
	}

	@Override
	public Product deleteProduct(Long id) {
		Product product = getProduct(id);
		productRepository.delete(product);
		return product;
	}

}
