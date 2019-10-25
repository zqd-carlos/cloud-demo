package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient      //表明自己是个eureka的客户端
public class ProdicerServoceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProdicerServoceApplication.class,args);
    }

}
