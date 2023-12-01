package com.example.demo.service;

import com.example.demo.domain.Comment;
import com.example.demo.dto.CommentDto;
import com.example.demo.dto.CommentPostDto;
import com.example.demo.repository.CommentRepository;
import com.example.demo.repository.MemberRepository;
import com.example.demo.repository.PostRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final MemberRepository memberRepository;
    private final PostRepository postRepository;

    @Transactional
    public Long commentPost(CommentPostDto request) {
        Comment comment = Comment.builder()
                .text(request.getText())
                .build();
        Comment savedComment = commentRepository.save(comment);
        return savedComment.getId();
    }

    @Transactional
    public CommentDto updateComment(CommentPostDto request) {
        Comment comment = commentRepository.findById(request.getId()).orElseThrow();

        comment.setText(request.getText());
        comment.setMember(memberRepository.findById(request.getPostId()));
        comment.setPost(postRepository.findById(request.getPostId()));

        return CommentDto.builder()
                .text(comment.getText())
                .memberId()
                .postId()
                .build();
    }
}
