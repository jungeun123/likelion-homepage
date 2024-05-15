package com.homepage.likelion.posts.controller;

import com.homepage.likelion.posts.dto.PostCreateDto;
import com.homepage.likelion.posts.dto.PostUpdateDto;
import com.homepage.likelion.posts.service.PostService;
import com.homepage.likelion.util.response.CustomApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/post")
public class PostController {
    private final PostService postService;

    @PostMapping
    public ResponseEntity<CustomApiResponse<?>> createPost(
            @Valid @RequestBody PostCreateDto.Req req) {
        ResponseEntity<CustomApiResponse<?>> result = postService.createPost(req);
        return result;
    }

    // 게시글 수정
    @PutMapping("/{postId}")
    public ResponseEntity<CustomApiResponse<?>> modifyPost(
        @PathVariable("postId") Long postId,
        @RequestBody PostUpdateDto.Req req) {
        ResponseEntity<CustomApiResponse<?>> result = postService.modifyPost(postId, req);
        return result;
    }

    @GetMapping("/all")
    public ResponseEntity<CustomApiResponse<?>> getAllPost() {
        ResponseEntity<CustomApiResponse<?>> result = postService.getAllPost();
        return result;
    }

    @GetMapping
    public ResponseEntity<CustomApiResponse<?>> getOnePost(
            @RequestParam("postId") Long postId){
        ResponseEntity<CustomApiResponse<?>> result = postService.getOnePost(postId);
        return result;
    }


}
