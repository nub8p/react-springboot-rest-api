package com.cnu.coffee.repository;

import com.cnu.coffee.domain.entity.Product;

import java.util.ArrayList;
import java.util.UUID;


public interface ProductRepository {
    abstract Product save(Product product);
    abstract Product search(UUID productId);
}
