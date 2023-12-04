package com.example.demo.web.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class CommentDto {

    private String text;

    private Long memberId;

    private Long postId;

    public CommentDto(String text, Long memberId, Long postId) {
        this.text = text;
        this.memberId = memberId;
        this.postId = postId;
    }
}
