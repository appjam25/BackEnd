package com.backend.backend_java.auth.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class SignupRequest {

    @NotBlank
    private String nickname;

    @NotBlank
    private String password;

    @NotBlank
    private String name;

    @NotNull
    private LocalDateTime birthDate;
}
