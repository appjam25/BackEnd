package com.backend.backend_java.domain.post.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class PostInfoResponse {

    private Long postId;

    private String writerNickname;

    private String postName;

    private String content;

    private String area;

    private String menu;

    private Integer maxPeople;

    private List<PostUserResponse> applyPeople;

    private String restaurantName;
}
