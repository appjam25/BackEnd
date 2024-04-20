package com.backend.backend_java.feed.domain.repository;

import com.backend.backend_java.feed.domain.Feed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedRepository extends JpaRepository<Feed, Long> {
}
