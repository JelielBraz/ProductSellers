package com.productsellers.productsellers.controller;

import com.productsellers.productsellers.model.Product;
import com.productsellers.productsellers.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "product/")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product save = productService.save(product);
        return ResponseEntity.ok(save);
    }

    @GetMapping
    public Page<Product> findAll(@PageableDefault Pageable pageable)
    {
        return productService.findAll(pageable);
    }
}
