package com.hcl.commerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.commerce.dto.ProductAddDTO;
import com.hcl.commerce.dto.ProductUpdateDTO;
import com.hcl.commerce.entity.Product;

@Service
public interface ProductService {

	Product addProduct(ProductAddDTO dto);

	List<Product> getAllProduct();

	Product getProduct(Long id);

	Product updateProduct(ProductUpdateDTO dto);

	Product deleteProduct(Long id);

}
