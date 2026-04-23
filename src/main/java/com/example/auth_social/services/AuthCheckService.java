package com.example.auth_social.services;


import com.example.auth_social.entity.User;
import com.example.auth_social.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class AuthCheckService {


    private final UserRepository userRepository;


    public Map<UUID, Boolean> checkUser(List<UUID> userIds) {

        List<UUID> existingIds = userRepository.findExistingIds(userIds);
        Set<UUID> existingSet = new HashSet<>(existingIds);

        return userIds.stream()
                .collect(Collectors.toMap(
                        id -> id,
                        id -> existingSet.contains(id)
                ));
    }
}
