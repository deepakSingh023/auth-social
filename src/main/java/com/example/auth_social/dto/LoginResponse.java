package com.example.auth_social.dto;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginResponse {
    private UUID  userId;
    private String accessToken;
    private String refreshToken;
    private String email;
    private String role;
}
