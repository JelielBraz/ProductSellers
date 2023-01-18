package com.productsellers.productsellers.service;

import com.productsellers.productsellers.model.Product;
import com.productsellers.productsellers.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    final
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }


    public Product save(Product product) {
        return productRepository.save(product);
    }
}
