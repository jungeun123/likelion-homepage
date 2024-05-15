package com.homepage.likelion.posts.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

public class PostListDto {
    @Getter @Builder
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public static class PostResponse {
        private Long postId;
        private String postedUserName;
        private String title;
        private String content;
        private LocalDateTime updatedAt;
    }

    //게시글 조회: List<Post> posts
    @Getter
    @Builder
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class SearchPostsRes {
        private List<PostListDto.PostResponse> posts;

        public SearchPostsRes(List<PostListDto.PostResponse> posts) {
            this.posts = posts;
        }
    }
}
