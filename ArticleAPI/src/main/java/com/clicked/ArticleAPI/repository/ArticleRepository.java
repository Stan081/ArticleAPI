package com.clicked.ArticleAPI.repository;

import com.clicked.ArticleAPI.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
