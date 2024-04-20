package com.backend.backend_java.auth.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class LoginRequest {

    @NotBlank
    private String nickname;

    @NotBlank
    private String password;
}
