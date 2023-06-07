package com.example.ffadmin.restConsumer.controllers;

import com.example.ffadmin.restConsumer.entities.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class RestProductCategoryController {
    @Autowired
    private RestTemplate restTemplate;
    private final String baseURI = "http://localhost:8080/product/";

    public ProductCategory findByName(String name){
        return null;
    }
}
