package com.backend.backend_java.domain.post.controller;

import com.backend.backend_java.domain.auth.dto.request.NicknameRequest;
import com.backend.backend_java.domain.post.dto.request.ApplyRequest;
import com.backend.backend_java.domain.post.dto.request.PostRequest;
import com.backend.backend_java.domain.post.dto.response.AllPostResponse;
import com.backend.backend_java.domain.post.dto.response.PostInfoResponse;
import com.backend.backend_java.domain.post.service.ApplyPostService;
import com.backend.backend_java.domain.post.service.PostInfoService;
import com.backend.backend_java.domain.post.service.QueryAllPostService;
import com.backend.backend_java.domain.post.service.WritePostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    private final ApplyPostService applyPostService;

    private final QueryAllPostService queryAllPostService;

    private final PostInfoService postInfoService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/write")
    public void writePost(@RequestBody @Valid PostRequest request) {
        writePostService.writePost(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/apply-post")
    public void applyPost(ApplyRequest request) {
        applyPostService.apply(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/all-post")
    public List<AllPostResponse> queryAllPost(@RequestBody @Valid NicknameRequest request) {
        return queryAllPostService.queryAllPost(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/post-info")
    public PostInfoResponse postInfo(@PathVariable Long postId) {
        return postInfoService.postInfo(postId);
    }
}
