package com.backend.backend_java.auth.service;

import com.backend.backend_java.auth.dto.request.SignupRequest;
import com.backend.backend_java.user.entity.User;
import com.backend.backend_java.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignupService {

    private final UserRepository userRepository;

    public void signup(SignupRequest request) {
        userRepository.save(
                User.builder()
                        .nickname(request.getNickname())
                        .password(request.getPassword())
                        .name(request.getName())
                        .birthDate(request.getBirthDate())
                        .build());
    }
}
