package com.example.config;

import com.example.model.Book;
import com.example.model.Review;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.example") 
public class AppConfig {

    @Bean
    public Book book1() {
        return new Book("Effective Java", "Joshua Bloch");
    }

    @Bean
    public Book book2() {
        return new Book("Clean Code", "Robert C. Martin");
    }

    @Bean
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

}