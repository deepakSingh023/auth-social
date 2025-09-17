package com.example.auth_social;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling   // ✅ this enables @Scheduled tasks like KeepAliveTask
public class AuthSocialApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthSocialApplication.class, args);
    }

}
