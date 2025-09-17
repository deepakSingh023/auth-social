package com.example.auth_social.entity;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users") // table name in DB
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, unique = true)
    private String email;

    private String username;

    private String password;

    private String provider; // "LOCAL" or "GOOGLE"

    private String role; // USER, ADMIN
}
