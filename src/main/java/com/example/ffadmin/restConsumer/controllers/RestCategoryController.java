package com.example.ffadmin.restConsumer.controllers;


import com.example.ffadmin.restConsumer.entities.Order;
import com.example.ffadmin.restConsumer.entities.ProductCategory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestCategoryController {
    private final RestTemplate restTemplate;
    private final String baseURI = "http://localhost:8080/category/";
    private RestProductCategoryController CategoryController;


    public RestCategoryController(){
        restTemplate = new RestTemplate();

    }

    public ProductCategory addCategory(String categoryName, Long catid){
        ProductCategory categ = this.CategoryController.findByName(categoryName);
        return restTemplate.postForObject(baseURI + "create?categoryName=" + categoryName + "&catid=" + catid, null, ProductCategory.class);
    }

}


