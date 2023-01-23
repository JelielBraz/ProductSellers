package com.productsellers.productsellers.service;

import com.productsellers.productsellers.model.Product;
import com.productsellers.productsellers.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    final
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }


    public Product save(Product product) {
        return productRepository.save(product);
    }
}
