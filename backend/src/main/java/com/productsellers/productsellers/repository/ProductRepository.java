package com.productsellers.productsellers.repository;

import com.productsellers.productsellers.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
