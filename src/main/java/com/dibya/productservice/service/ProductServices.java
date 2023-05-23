package com.dibya.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dibya.productservice.entity.ProductEntity;
@Service
public interface ProductServices {
	ProductEntity processCreateProduct(ProductEntity productEntity);
	 Object processGetById(Long id);
	 Object processGetProductByName(String name);
	List<ProductEntity> processGetAllProducts();
	List<ProductEntity> saveAllProduct(List<ProductEntity> productEntity);
	
	 

}
