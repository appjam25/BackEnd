package com.backend.backend_java.domain.post.dto.response;

import com.backend.backend_java.domain.post.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AllPostResponse {

    private Long postId;

    private String writerNickname;

    private String postName;

    private String content;

    private String area;

    private String menu;

    private Integer maxPeople;

    private Integer applyPeople;

    private Boolean isApply = false;

    public AllPostResponse(Post post) {
        postId = post.getId();
        writerNickname = post.getWriterNickname();
        postName = post.getPostName();
        content = post.getContent();
        area = post.getArea();
        menu = post.getMenu();
        maxPeople = post.getMaxPeople();
        applyPeople = post.getMembers().size();
    }

    public void apply() {
        isApply = true;
    }
}