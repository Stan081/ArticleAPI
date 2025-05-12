package com.clicked.ArticleAPI.repository;

import com.clicked.ArticleAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}