package com.cnu.coffee.repository;

import com.cnu.coffee.domain.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.UUID;

@Repository
public class ProductHashMapRepository implements ProductRepository{
    HashMap<UUID, Product> db = new HashMap<>();


    @Override
    public Product save(Product product) {
        db.put(UUID.randomUUID(), product);
        return product;
    }

    @Override
    public Product search(UUID productId) {
        return db.get(productId);
    }


}
