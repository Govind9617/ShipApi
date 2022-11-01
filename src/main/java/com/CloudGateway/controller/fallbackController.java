package com.CloudGateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fallbackController {

    @GetMapping("/orderServiceFallback")
    public String orderServiceFallback(){
        return "order service is down";
    }

    @GetMapping("/productServiceFallback")
    public String productServiceFallback(){
        return "product service is down";
    }
}
