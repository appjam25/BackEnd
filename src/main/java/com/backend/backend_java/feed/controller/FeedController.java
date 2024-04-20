package com.backend.backend_java.feed.controller;

import com.backend.backend_java.feed.controller.dto.response.QueryAllFeedResponse;
import com.backend.backend_java.feed.service.QueryAllFeedService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feed")
@RequiredArgsConstructor
public class FeedController {
    private final QueryAllFeedService queryAllFeedService;

    @GetMapping("/all")
    public List<QueryAllFeedResponse> queryAllFeed() {
        return queryAllFeedService.feedAll();
    }
}
