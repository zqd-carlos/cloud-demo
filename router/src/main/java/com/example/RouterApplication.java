package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 活着真难
 * 活着真累
 * 还不想死
 */

/**
 * 手动建立启动类
 */
@SpringBootApplication
@EnableZuulProxy
public class RouterApplication {

    public static void main(String[] args)
{
        SpringApplication.run(RouterApplication.class,args);
        }
        }