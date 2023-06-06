package com.example.ffadmin.restConsumer.controllers;

import com.example.ffadmin.restConsumer.entities.Product;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {
    private final RestTemplate restTemplate;
    private final String baseURI = "http://localhost:8080/product/";

    public ProductController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public Product readProduct(Long id){
        if(id == null){
            throw new RuntimeException("cant request null");
        }
        return restTemplate.getForObject(baseURI +  "read?id=" + id, Product.class);
    }
}
