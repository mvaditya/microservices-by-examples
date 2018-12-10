package com.mydzone.microservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mydzone.microservices.entities.Product;
import com.mydzone.microservices.exceptions.ProductNotFoundException;
import com.mydzone.microservices.services.ProductService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/products")
@Slf4j
public class ProductController {
	private final ProductService service;
	
	@Autowired
	public ProductController(ProductService service) {
		this.service = service;
	}
	
	@GetMapping("")
	public List<Product> getAllProducts() {
		return service.findAllProducts();
	}
	
	@GetMapping("/{code}")
	public Product getProductByCode(@PathVariable String code) {
		return service.findProductByCode(code).orElseThrow(() -> new 
				ProductNotFoundException("Product with code [" + code + "] does not exist"));
	}
}
