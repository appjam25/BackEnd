package com.backend.backend_java.domain.post.repository;

import com.backend.backend_java.domain.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
