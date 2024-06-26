package com.backend.backend_java.domain.auth.controller;

import com.backend.backend_java.domain.auth.dto.reponse.LoginResponse;
import com.backend.backend_java.domain.auth.dto.request.LoginRequest;
import com.backend.backend_java.domain.auth.dto.request.NicknameRequest;
import com.backend.backend_java.domain.auth.dto.request.SignupRequest;
import com.backend.backend_java.domain.auth.service.CheckNicknameService;
import com.backend.backend_java.domain.auth.service.LoginService;
import com.backend.backend_java.domain.auth.service.SignupService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final SignupService signupService;

    private final LoginService loginService;

    private final CheckNicknameService checkNicknameService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/signup")
    public void signup(@RequestBody @Valid SignupRequest request) {
        signupService.signup(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/login")
    public LoginResponse login(@RequestBody @Valid LoginRequest request) {
        return loginService.login(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/check-nickname")
    public void checkNickname(@RequestBody @Valid NicknameRequest request) {
        checkNicknameService.checkNickname(request);
    }
}
