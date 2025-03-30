package com.example.commerce.service;

import com.example.commerce.model.Product;
import com.example.commerce.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productService {
    @Autowired
    private productRepository prepository;

    public List<Product> getAllProducts() {
        return prepository.findAll();
    }
    public Product getProduct(int id) {
        return prepository.findById(id).orElse(null);

    }
    public Product addProduct(Product product) {
        System.out.println("hello every one");
        return prepository.save(product);
    }
    public void updateProduct(Product product) {
        prepository.save(product);
    }
    public void deleteProduct(int id) {
        prepository.deleteById(id);
    }


}
