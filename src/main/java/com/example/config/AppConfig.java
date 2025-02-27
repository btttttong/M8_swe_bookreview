package com.example.config;

import com.example.model.Book;
import com.example.model.Review;
import com.example.service.BookCatalog;
import com.example.service.ReviewManager;
import com.example.DataInitializer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example") // ✅ Ensure Spring scans all components
public class AppConfig {

    @Bean(name = "book1")
    public Book book1() {
        return new Book("Effective Java", "Joshua Bloch");
    }

    @Bean(name = "book2")
    public Book book2() {
        return new Book("Clean Code", "Robert C. Martin");
    }

    @Bean(name = "book3")
    public Book book3() {
        return new Book("Spring in Action", "Craig Walls");
    }

    @Bean
    public Review review1() {
        return new Review("Great book on Java!", 5);
    }

    @Bean
    public Review review2() {
        return new Review("Must-read for software engineers", 5);
    }

    @Bean
    public Review review3() {
        return new Review("Excellent resource on Spring", 4);
    }

    @Bean
    public DataInitializer dataInitializer(BookCatalog bookCatalog, ReviewManager reviewManager) {
        return new DataInitializer(bookCatalog, reviewManager);
    }
}