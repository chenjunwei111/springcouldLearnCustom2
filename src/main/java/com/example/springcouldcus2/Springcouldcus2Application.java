package com.example.springcouldcus2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class Springcouldcus2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcouldcus2Application.class, args);
    }

}
