package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Getter
@Builder
public class CommentPostDto {

    private Long id;

    private String text;

    private Long memberId;

    private Long postId;

    public CommentPostDto(Long id, String text, Long memberId, Long postId) {
        this.id = id;
        this.text = text;
        this.memberId = memberId;
        this.postId = postId;
    }
}
