package com.dibya.productservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dibya.productservice.entity.ProductEntity;
import com.dibya.productservice.repository.ProductRepository;
import com.dibya.productservice.service.ProductServices;
@Service
public class ServiceImplementation  implements ProductServices{
    @Autowired
	private ProductRepository productRepository;
	@Override
	public  ProductEntity processCreateProduct(ProductEntity productEntity) {
	return	productRepository.saveProduct(productEntity);
		
		
	}
	@Override
	public Object processGetById(Long id) {
	return	 productRepository.getProductById(id);
		
		
	}
	@Override
	public Object processGetProductByName(String name) {
	return 	productRepository.getProductByName(name);
		
	}
	@Override
	public List<ProductEntity> processGetAllProducts() {
		return productRepository.findAllProducts();
		
	}
	@Override
	public List<ProductEntity> saveAllProduct(List<ProductEntity> productEntity) {
	 return	productRepository.saveGroupOfProducts(productEntity);
		
	}
	
	

}
