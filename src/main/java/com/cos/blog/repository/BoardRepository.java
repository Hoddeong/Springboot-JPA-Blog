package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cos.blog.model.Board;

@Repository //생략가능
public interface BoardRepository extends JpaRepository<Board, Integer> {
}

