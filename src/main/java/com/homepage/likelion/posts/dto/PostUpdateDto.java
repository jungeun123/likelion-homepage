package com.homepage.likelion.posts.dto;

import com.homepage.likelion.util.response.CustomApiResponse;
import lombok.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;

import java.time.LocalDateTime;

public class PostUpdateDto {

    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access =  AccessLevel.PROTECTED)
    public static class Req {
        private Long postId;
        private String postedUserName;
        private String password;
        private String title;
        private String content;



    }

    @Getter
    @Builder
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class UpdatePost {
        private LocalDateTime updatedAt;

        public UpdatePost(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
        }
    }
}
