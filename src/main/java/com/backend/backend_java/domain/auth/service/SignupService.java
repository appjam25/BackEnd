package com.backend.backend_java.domain.auth.service;

import com.backend.backend_java.domain.auth.dto.request.SignupRequest;
import com.backend.backend_java.domain.user.entity.User;
import com.backend.backend_java.domain.user.repository.UserRepository;
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
                        .address(request.getAddress())
                        .birthDate(request.getBirthDate())
                        .build());
    }
}
