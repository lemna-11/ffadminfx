package com.example.ffadmin.restConsumer.controllers;

import com.example.ffadmin.restConsumer.entities.Order;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestOrderController {
    private final RestTemplate restTemplate;
    private final String baseURI = "http://localhost:3306/order/";


    public RestOrderController(){
        restTemplate = new RestTemplate();

    }

    public Order openOrder(Long ordid){
        return restTemplate.postForObject(baseURI + "find?ordid=" + ordid, null, Order.class);
    }


}

