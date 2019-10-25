package com.service;


import org.springframework.stereotype.Service;

/**
 * BlogSerice的熔断讲解处理类，用于处理BlogService由于服务失败倒是的阻塞的降级方案
 */
@Service  //feign的熔断器类需要交给ioc容器管理，因此需要添加注解
public class BlogServiceFallBack implements BlogService{
}
