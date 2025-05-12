package com.clicked.ArticleAPI.services;

import com.clicked.ArticleAPI.model.Article;
import com.clicked.ArticleAPI.repository.ArticleRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArticleService {
    private final ArticleRepository repository;

    public ArticleService(ArticleRepository repository) {
        this.repository = repository;
    }

    public Article saveArticle(Article article) {
        return repository.save(article);
    }

    public List<Article> getAllArticles() {
        return repository.findAll();
    }
}