package com.example.commerce.controller;

import com.example.commerce.model.Product;
import com.example.commerce.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class productController {

    @Autowired
    productService productService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }
    @GetMapping("/products/{id}")
    public Product getProducts(@RequestParam int id) {
        return productService.getProduct(id);
    }
    @PostMapping("/products")
    public ResponseEntity<Product>addProduct(@RequestBody Product product) {
        Product product1=productService.addProduct(product);
        System.out.println(product);
        return ResponseEntity.ok(product1);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@RequestParam int id) {
        productService.deleteProduct(id);
    }

    }