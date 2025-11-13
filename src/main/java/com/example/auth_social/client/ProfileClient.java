package com.example.auth_social.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@FeignClient(
        name = "profile-service",
        url = "${profile.service.url}" // configurable in application.yml
)
public interface ProfileClient {

    @PostMapping("/api/profiles")
    void createProfile(@RequestBody Map<String, Object> request);
}
