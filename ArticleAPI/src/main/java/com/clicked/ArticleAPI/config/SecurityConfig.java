//package com.clicked.ArticleAPI.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.config.http;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/admin/**").hasRole("ADMIN")
//                        .requestMatchers("/articles/**").permitAll()
//                        .requestMatchers("/users/register").permitAll()
//                )
//                .httpBasic(HttpBasicConfigurer::withDefaults); // Updated to avoid deprecated method
//
//        return http.build();
//    }
//}