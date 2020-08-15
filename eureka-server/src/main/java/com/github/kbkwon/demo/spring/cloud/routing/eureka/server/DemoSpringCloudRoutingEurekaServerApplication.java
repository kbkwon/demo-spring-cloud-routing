package com.github.kbkwon.demo.spring.cloud.routing.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoSpringCloudRoutingEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringCloudRoutingEurekaServerApplication.class, args);
    }

}
