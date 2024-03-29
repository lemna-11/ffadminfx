package com.example.ffadmin.restConsumer.entities;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private Long ordid;
    private List<Product> products;
    private OrderStatus status;

    public Long getPriceInCents(){
        return products.stream()
                .map(Product::getPriceInCents)
                .reduce(Long::sum)
                .orElseThrow();
    }
}
