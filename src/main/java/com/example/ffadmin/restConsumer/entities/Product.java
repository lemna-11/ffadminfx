package com.example.ffadmin.restConsumer.entities;

import lombok.Data;

@Data
public class Product {
    private Long proid;
    private String name;
    private ProductCategory category;
    private Long priceInCents;
}