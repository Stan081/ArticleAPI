package com.clicked.ArticleAPI.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.clicked.ArticleAPI.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password, @RequestParam boolean isAdmin) {
        service.registerUser(username, password, isAdmin);
        return "User registered successfully!";
    }
}