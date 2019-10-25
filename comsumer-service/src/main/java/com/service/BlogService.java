package com.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="producer-service") //name属性必须是服务的名称，也就是spring.application.name的值
public interface BlogService {






}

