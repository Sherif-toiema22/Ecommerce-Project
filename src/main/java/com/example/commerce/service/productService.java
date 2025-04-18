package com.example.commerce.service;
import com.example.commerce.model.Product;
import com.example.commerce.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class productService {
    @Autowired
    private productRepository prepository;


    public List<Product> getAllProducts() {
        return prepository.findAll();

    }

    public Product getProductById(int id) {
        return prepository.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageDate(imageFile.getBytes());
        return prepository.save(product);
    }
    public void updateProduct(Product product) {
        prepository.save(product);
    }
    public void deleteProduct(int id) {
        prepository.deleteById(id);
    }


}
