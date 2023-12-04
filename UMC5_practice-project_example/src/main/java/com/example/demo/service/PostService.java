package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Post;
import com.example.demo.web.dto.PostDto;
import com.example.demo.web.dto.PostRequest;
import com.example.demo.web.dto.PostUpdateRequest;
import com.example.demo.web.dto.PostUpdateResponse;
import com.example.demo.repository.PostRepository;

@Service
public class PostService {
	/*

	private final PostRepository postRepository;

	@Autowired
	public PostService(PostRepository postRepository) {
		this.postRepository = postRepository;
	}


	@Transactional
	public Long post(PostRequest request) {
		Post post = new Post(request.getTitle(), request.getText());
		Post savedPost = postRepository.save(post);
		return savedPost.getId();
	}

	@Transactional
	public PostDto getPost(Long postId) {
		Optional<Post> optionalPost = postRepository.findById(postId);
		Post post = optionalPost.get();

		PostDto dto = new PostDto(post.getId(), post.getTitle(), post.getText());

		return dto;
	}


	@Transactional
	public PostUpdateResponse updatePost(PostUpdateRequest request) {
		// 조회하는 것은 위와 같음
		Optional<Post> optionalPost = postRepository.findById(request.getId());
		Post post = optionalPost.get();

		// 조회후 엔티티 내부의 필드 변경
		post.setTitle(request.getTitle());
		post.setText(request.getText());

		return new PostUpdateResponse(
			post.getText(),
			post.getTitle()
		);
	}


	 */


}
