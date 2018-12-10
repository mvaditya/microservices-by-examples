package com.mydzone.microservices.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydzone.microservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	Optional<Product> findByCode(String code);
}
