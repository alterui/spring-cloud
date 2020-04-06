package com.lr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liurui
 * @date 2020/4/4 16:50
 */
@SpringBootApplication
@EnableEurekaClient
public class Order80Application {
    public static void main(String[] args) {
        SpringApplication.run(Order80Application.class, args);
    }
}
