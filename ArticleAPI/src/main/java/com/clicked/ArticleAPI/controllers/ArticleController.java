package com.clicked.ArticleAPI.controllers;

import com.clicked.ArticleAPI.model.Article;
import com.clicked.ArticleAPI.services.ArticleService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    private final ArticleService service;

    public ArticleController(ArticleService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Article createArticle(@Valid @RequestBody Article article) {
        return service.saveArticle(article);
    }

    @GetMapping("/list")
    public List<Article> listArticles() {
        return service.getAllArticles();
    }
}