package com.nisum.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nisum.springboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	Product findByName(String name);
}
