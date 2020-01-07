package com.springcloud.movie;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RibbonClient(name = "user-service-provider")
@EnableCircuitBreaker
public class MovieApplicationFeinWithoutHistrix {

    public static void main(String[] args) {
        SpringApplication.run(MovieApplicationFeinWithoutHistrix.class, args);
    }

}
