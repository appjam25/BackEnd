package com.backend.backend_java.domain.feed.service;

import com.backend.backend_java.domain.feed.controller.dto.response.QueryAllFeedResponse;
import com.backend.backend_java.domain.feed.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QueryAllFeedService {
    private final FeedRepository feedRepository;

    @Transactional(readOnly = true)
    public List<QueryAllFeedResponse> feedAll() {
        return feedRepository.findAll()
                .stream()
                .map(QueryAllFeedResponse::queryAllFeedResponse)
                .collect(Collectors.toList());
    }
}
