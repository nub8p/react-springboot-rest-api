package com.cnu.coffee.service;

import com.cnu.coffee.domain.entity.Product;
import com.cnu.coffee.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;


    public Product save(Product product) {
        return productRepository.save(product);
    }

    public ArrayList<Product> search(UUID productId) {
        return productRepository.search(productId);
    }
}
