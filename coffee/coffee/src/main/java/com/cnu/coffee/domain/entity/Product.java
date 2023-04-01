package com.cnu.coffee.domain.entity;

import java.util.UUID;

public class Product {
    public UUID productId;
    public String name;
    public Long price;

    public Product(String name, Long price) {
        this.name = name;
        this.price = price;
    }
}
