package com.backend.backend_java.domain.feed.repository;

import com.backend.backend_java.domain.feed.entity.Feed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedRepository extends JpaRepository<Feed, Long> {
}
