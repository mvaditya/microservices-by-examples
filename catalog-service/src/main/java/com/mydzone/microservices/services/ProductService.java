package com.mydzone.microservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mydzone.microservices.entities.Product;
import com.mydzone.microservices.repositories.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class ProductService {
	private final ProductRepository repository;
	
	@Autowired
	public ProductService(ProductRepository repository) {
		this.repository = repository;
	}
	
	public List<Product> findAllProducts() {
		return repository.findAll();
	}
	
	public Optional<Product> findProductByCode(String code) {
		return repository.findByCode(code);
	}
}
