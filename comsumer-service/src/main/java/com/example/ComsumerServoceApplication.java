package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient      //表明自己是个eureka的客户端
public class ComsumerServoceApplication {


    public static void main(String[] args) {
        SpringApplication.run(ComsumerServoceApplication.class,args);
    }



}
