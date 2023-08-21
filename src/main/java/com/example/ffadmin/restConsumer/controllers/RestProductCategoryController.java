package com.example.ffadmin.restConsumer.controllers;

import com.example.ffadmin.restConsumer.entities.Product;
import com.example.ffadmin.restConsumer.entities.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestProductCategoryController {
    private final RestTemplate restTemplate;
    private final String baseURI = "http://localhost:8080/productcategory/";

    public RestProductCategoryController(){
        restTemplate = new RestTemplate();
    }

    public ProductCategory findByName(String name){
        return restTemplate.getForObject(baseURI +  "readCategoryName?name=" + name, ProductCategory.class);
    }
    public ProductCategory addCategory(String categoryName){
        return restTemplate.postForObject(baseURI + "create?categoryName=" + categoryName, null, ProductCategory.class);
    }
}
