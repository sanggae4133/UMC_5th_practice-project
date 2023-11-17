package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
