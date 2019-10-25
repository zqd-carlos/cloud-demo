package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient      //表明自己是个eureka的客户端
public class ServiceAApplication {

    @Autowired
    private RestTemplate restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(ServiceAApplication.class,args);
    }


    /**
     * 访问其他服务的htttp客户端
     * @return
     */
    @Bean
    @LoadBalanced       //通过ribbon实现客户端的负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/proxyHello")
    public ResponseEntity<String> proxyHello(){
       //需要通过restTemplate对象访问服务器B,url中服务器b的spring.application.name作为服务器请求的地址
         return restTemplate.getForEntity("http://service-b/hello",String.class);

    }
}
