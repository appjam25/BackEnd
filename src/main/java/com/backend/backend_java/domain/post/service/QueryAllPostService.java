package com.backend.backend_java.domain.post.service;

import com.backend.backend_java.domain.post.dto.response.AllPostResponse;
import com.backend.backend_java.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QueryAllPostService {

    private final PostRepository postRepository;

    public List<AllPostResponse> queryAllPost() {
        return postRepository.findAll()
                .stream()
                .map(AllPostResponse::new)
                .collect(Collectors.toList());
    }
}
