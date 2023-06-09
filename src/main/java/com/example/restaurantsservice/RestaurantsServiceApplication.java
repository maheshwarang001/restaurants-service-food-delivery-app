package com.example.restaurantsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestaurantsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantsServiceApplication.class, args);
    }

}
