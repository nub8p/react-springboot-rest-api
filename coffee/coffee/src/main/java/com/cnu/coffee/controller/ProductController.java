package com.cnu.coffee.controller;

import com.cnu.coffee.domain.entity.Product;
import com.cnu.coffee.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.UUID;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/save")
    public Product save(@RequestParam("name") String name, @RequestParam("price") Long price) {
        Product product = new Product(name, price);
        return productService.save(product);
    }

    @RequestMapping("/search")
    public ArrayList<Product> search(@RequestParam("id") UUID productId) {
        return productService.search(productId);
    }
}
