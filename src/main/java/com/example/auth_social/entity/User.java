package com.example.auth_social.entity;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    private String username;

    private String password;

    private String provider; // "LOCAL" or "GOOGLE"

    private String role; // USER, ADMIN
}
