package com.backend.backend_java.domain.post.dto.request;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
public class ApplyRequest {

    @NotBlank
    private String nickname;

    @NotNull
    private Long postId;
}
