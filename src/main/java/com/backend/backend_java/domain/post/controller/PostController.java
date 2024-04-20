package com.backend.backend_java.domain.post.controller;

import com.backend.backend_java.domain.post.dto.request.PostRequest;
import com.backend.backend_java.domain.post.dto.response.AllPostResponse;
import com.backend.backend_java.domain.post.service.QueryAllPostService;
import com.backend.backend_java.domain.post.service.WritePostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {

    private final WritePostService writePostService;

    private final QueryAllPostService queryAllPostService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/write")
    public void writePost(@RequestBody @Valid PostRequest request) {
        writePostService.writePost(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/all-post")
    public List<AllPostResponse> queryAllPost() {
        return queryAllPostService.queryAllPost();
    }
}
