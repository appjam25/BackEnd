package com.backend.backend_java.domain.auth.service;

import com.backend.backend_java.domain.auth.dto.request.NicknameRequest;
import com.backend.backend_java.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CheckNicknameService {

    private final UserRepository userRepository;

    public void checkNickname(NicknameRequest request) {
        if(userRepository.existsByNickname(request.getNickname())) throw new RuntimeException("중복되는 닉네임입니다.");
    }
}
