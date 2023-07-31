package com.example.ffadmin.restConsumer.controllers;

import com.example.ffadmin.restConsumer.entities.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestProductCategoryController {
    private final RestTemplate restTemplate;
    private final String baseURI = "http://localhost:8080/product/";

    public RestProductCategoryController(){
        restTemplate = new RestTemplate();
    }

    public ProductCategory findByName(String name){
        return null;
    }
}
