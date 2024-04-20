package com.backend.backend_java.domain.auth.service;

import com.backend.backend_java.domain.auth.dto.request.LoginRequest;
import com.backend.backend_java.domain.user.entity.User;
import com.backend.backend_java.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserRepository userRepository;

    public void login(LoginRequest request) {
        User user = userRepository.findByNickname(request.getNickname());
    }
}
