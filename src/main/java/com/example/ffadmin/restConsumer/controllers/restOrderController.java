package com.example.ffadmin.restConsumer.controllers;

import com.example.ffadmin.restConsumer.entities.Order;
import org.springframework.web.client.RestTemplate;

public class RestOrderController  {
    private final RestTemplate restTemplate;
    private final String baseURI = "http://localhost:8080/product/";



    public RestOrderController(RestOrderController orderController) {
        this.orderController = orderController;
    }
}
    public Long openOrder(String name, String status, Long ordid){
        Order order = this.restOrderController.findById(id);
        return restTemplate.postForObject(baseURI + "create?ordid=" + ordid + "&status=" + status, null, Long.class);
    }
