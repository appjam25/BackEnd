package com.backend.backend_java.domain.post.service;

import com.backend.backend_java.domain.post.dto.request.PostRequest;
import com.backend.backend_java.domain.post.entity.Post;
import com.backend.backend_java.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WritePostService {

    private final PostRepository postRepository;

    public void writePost(PostRequest request) {
        postRepository.save(
                Post.builder()
                        .writerNickname(request.getWriterNickname())
                        .postName(request.getTitle())
                        .content(request.getContent())
                        .area(request.getArea())
                        .menu(request.getMenu())
                        .maxPeople(request.getMaxPeople())
                        .restaurantName(request.getRestaurantName())
                        .build());
    }
}
