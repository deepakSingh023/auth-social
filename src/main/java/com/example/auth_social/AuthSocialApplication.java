package com.example.auth_social;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling              // Enables scheduled tasks (like KeepAliveTask)
@EnableFeignClients(           // Enables Feign clients for inter-service communication
        basePackages = "com.example.auth_social.client"
)
public class AuthSocialApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthSocialApplication.class, args);
    }
}
