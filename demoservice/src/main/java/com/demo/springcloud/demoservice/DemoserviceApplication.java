package com.demo.springcloud.demoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoserviceApplication.class, args);
    }
}
