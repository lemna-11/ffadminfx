package com.example.ffadmin.restConsumer.controllers;


import com.example.ffadmin.restConsumer.entities.Order;
import com.example.ffadmin.restConsumer.entities.ProductCategory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestCategoryController {
    private final RestTemplate restTemplate;
    private final String baseURI = "http://localhost:3306/category/";


    public RestCategoryController(){
        restTemplate = new RestTemplate();
    }

    public ProductCategory addCategory(String categoryName){
        return restTemplate.postForObject(baseURI + "create?categoryName=" + categoryName, null, ProductCategory.class);
    }
}


