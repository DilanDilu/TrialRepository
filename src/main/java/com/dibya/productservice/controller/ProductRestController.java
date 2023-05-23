package com.dibya.productservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dibya.productservice.entity.ProductEntity;
import com.dibya.productservice.service.impl.ServiceImplementation;

@RestController
public class ProductRestController {
	@Autowired
	private ServiceImplementation serviceImplementation;

	@PostMapping(value = "/createProduct")
	public ProductEntity createProduct(@RequestBody ProductEntity productEntity) {
		System.out.println(productEntity);
		return serviceImplementation.processCreateProduct(productEntity);

	}

	@GetMapping(value = "/getProductById/{altkey}")
	public @ResponseBody ProductEntity getProductById(@PathVariable("altkey") Long id) {
		// @pathvariable is used get the data from url
		ProductEntity processGetById = (ProductEntity) serviceImplementation.processGetById(id);
		return processGetById;
	}

	@GetMapping(value = "/getProductByName/{name}")
	public @ResponseBody ProductEntity getProductByName(@PathVariable("name") String name) {
		ProductEntity productByName = (ProductEntity) serviceImplementation.processGetProductByName(name);
		return productByName;

	}

	@GetMapping(value = "/getAllProducts")
	public @ResponseBody List<ProductEntity> getAllProducts() {
		return serviceImplementation.processGetAllProducts();

	}

	@PostMapping(value = "/createGroupOfProducts")
	public List<ProductEntity> createGroupOfProducts(@RequestBody List<ProductEntity> productEntity) {
		List<ProductEntity> list = new ArrayList<ProductEntity>();
		List<ProductEntity> list2 = serviceImplementation.processGetAllProducts();
		for (ProductEntity p : productEntity) {
			list.add((p));
		}
		return list;

	}

}
