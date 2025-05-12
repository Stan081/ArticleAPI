package com.clicked.ArticleAPI.model;

import org.springframework.data.annotation.Id;
import jakarta.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    @NotBlank(message = "Article title can not be blank")
    private String title;

    @Column(nullable = false)
    @NotBlank(message = "Article Author can not be blank")
    private String author;

    @Column(nullable = false, columnDefinition = "TEXT")
    @NotBlank (message = "Article content can not be blank")
    private String content;

    @Column(nullable = false)
    @PastOrPresent
    private LocalDate publishedDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }
}