package com.example.ffadmin.restConsumer.controllers;

import com.example.ffadmin.restConsumer.entities.Order;
import com.example.ffadmin.restConsumer.entities.Product;
import com.example.ffadmin.restConsumer.entities.ProductCategory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestProductController {
    private final RestTemplate restTemplate;
    private final String baseURI = "http://localhost:8080/product/";
    private final RestProductCategoryController productCategoryController;

    public RestProductController(){
        restTemplate = new RestTemplate();
        productCategoryController = new RestProductCategoryController();
    }

    public Product readProduct(Long id){
        if(id == null){
            throw new RuntimeException("cant request null");
        }
        return restTemplate.getForObject(baseURI +  "read?id=" + id, Product.class);
    }

    public Long addProduct(String name, String category, Long price){
        ProductCategory cat = this.productCategoryController.findByName(category);
        if(name == null){
            throw new RuntimeException("cant be not named");
        }else if (category == null){
            throw new RuntimeException("cant have no category");
        }
        else if(price == null){
            throw new RuntimeException("cant have no price");
        }
        return restTemplate.postForObject(baseURI + "create?name=" + name + "&category=" + cat.getId() + "&price=" + price, null, Long.class);
    }
}
