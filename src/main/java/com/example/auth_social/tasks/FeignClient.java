package com.example.auth_social.tasks;


import com.example.auth_social.dto.CreateProfile;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@org.springframework.cloud.openfeign.FeignClient(name="profile-creation" ,url="https://profile-social-cokq.onrender.com/api")
public interface FeignClient {


    @PostMapping("/profile/create")
    void createProfile(
            @RequestBody CreateProfile data,
            @RequestHeader("Authorization") String token);

}

