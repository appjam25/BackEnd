package com.backend.backend_java.domain.post.service;

import com.backend.backend_java.domain.post.dto.request.ApplyRequest;
import com.backend.backend_java.domain.post.entity.Post;
import com.backend.backend_java.domain.post.repository.PostRepository;
import com.backend.backend_java.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ApplyPostService {

    private final PostRepository postRepository;

    private final UserRepository userRepository;

    @Transactional
    public void apply(ApplyRequest request) {
        Post post = postRepository.findById(request.getPostId())
                        .orElseThrow(IllegalAccessError::new);

        post.addMember(userRepository.findByNickname(request.getNickname()));
    }
}
