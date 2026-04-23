package com.example.auth_social.controller;


import com.example.auth_social.services.AuthCheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/auth-check")
public class AuthCheckController {

    private final AuthCheckService authCheckService;

    @GetMapping("/check")
    public ResponseEntity<Map<UUID,Boolean>> getCheck(
            @RequestBody List<UUID> userIds
            ){
       return  ResponseEntity.ok(authCheckService.checkUser(userIds));
    }


}
