package com.backend.backend_java.auth.dto.request;

import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class LoginRequest {

    @NotBlank
    private String nickname;

    @NotBlank
    private String password;
}
