package com.backend.backend_java.auth.controller;

import com.backend.backend_java.auth.dto.request.LoginRequest;
import com.backend.backend_java.auth.dto.request.SignupRequest;
import com.backend.backend_java.auth.service.LoginService;
import com.backend.backend_java.auth.service.SignupService;
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

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/signup")
    public void signup(@RequestBody @Valid SignupRequest request) {
        signupService.signup(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/login")
    public void login(@RequestBody @Valid LoginRequest request) {
        loginService.login(request);
    }
}
