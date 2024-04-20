package com.backend.backend_java.domain.post.service;

import com.backend.backend_java.domain.post.dto.response.PostInfoResponse;
import com.backend.backend_java.domain.post.entity.Post;
import com.backend.backend_java.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostInfoService {

    private final PostRepository postRepository;

    public PostInfoResponse postInfo(Long postId) {
        Post post = postRepository.findById(postId)
                .orElseThrow(IllegalAccessError::new);

        return PostInfoResponse.builder()
                .postId(postId)
                .writerNickname(post.getWriterNickname())
                .postName(post.getPostName())
                .content(post.getContent())
                .area(post.getArea())
                .menu(post.getMenu())
                .maxPeople(post.getMaxPeople())
                .applyPeople(post.getMembers())
                .restaurantName(post.getRestaurantName())
                .build();
    }
}