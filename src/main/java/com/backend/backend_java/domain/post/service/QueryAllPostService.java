package com.backend.backend_java.domain.post.service;

import com.backend.backend_java.domain.auth.dto.request.NicknameRequest;
import com.backend.backend_java.domain.post.dto.response.AllPostResponse;
import com.backend.backend_java.domain.post.entity.Post;
import com.backend.backend_java.domain.post.repository.PostRepository;
import com.backend.backend_java.domain.user.entity.User;
import com.backend.backend_java.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QueryAllPostService {

    private final UserRepository userRepository;

    private final PostRepository postRepository;

    public List<AllPostResponse> queryAllPost(NicknameRequest request) {
        User user = userRepository.findByNickname(request.getNickname());

        List<AllPostResponse> allPost = postRepository.findAll()
                .stream()
                .map(AllPostResponse::new)
                .collect(Collectors.toList());

        allPost.forEach(post -> {
            Post userPost = postRepository.findById(post.getPostId())
                    .orElseThrow(IllegalAccessError::new);

            if(userPost.getMembers().contains(user)) post.apply();
        });

        return allPost;
    }
}
