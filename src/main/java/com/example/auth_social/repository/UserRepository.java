package com.example.auth_social.repository;

import com.example.auth_social.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // Marks this as a Spring-managed bean
public interface UserRepository extends JpaRepository<User, Long> {

    // Find user by email (useful for login)
    Optional<User> findByEmail(String email);

    // Check if email already exists (useful for signup validation)
    boolean existsByEmail(String email);
}
