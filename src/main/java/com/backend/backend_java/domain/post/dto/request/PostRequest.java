package com.backend.backend_java.domain.post.dto.request;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
public class PostRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String content;

    @NotBlank
    private String area;

    @NotNull
    private Integer maxPeople;

    @NotBlank
    private String menu;

    @NotBlank
    private String restaurantName;
}