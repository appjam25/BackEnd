package com.backend.backend_java.feed.controller.dto.response;

import com.backend.backend_java.feed.domain.Feed;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class QueryAllFeedResponse {
    private Long id;

    private String username;

    private String title;

    private String imageUrl;

    private String tag;

    private String place;

    private Integer people;

    public static QueryAllFeedResponse queryAllFeedResponse(Feed feed) {
        return QueryAllFeedResponse.builder()
                .id(feed.getId())
                .username(feed.getUsername())
                .title(feed.getTitle())
                .imageUrl(feed.getImageUrl())
                .tag(feed.getTag())
                .place(feed.getPlace())
                .people(feed.getPeople())
                .build();
    }
}
