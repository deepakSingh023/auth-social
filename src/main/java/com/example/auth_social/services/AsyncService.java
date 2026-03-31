package com.example.auth_social.services;


import com.example.auth_social.dto.CreateProfile;
import com.example.auth_social.tasks.FeignClient;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class AsyncService {

    private final FeignClient feignClient;

    private final Logger log = LoggerFactory.getLogger(AsyncService.class);



    @Async("profileExecutor")
    public void createProfiles(CreateProfile data, String secret){

        try {
            feignClient.createProfile(data, secret);
        } catch (Exception e) {
            log.error("Failed to create profile for userId={}", data.userId(), e);
        }
    }
}
