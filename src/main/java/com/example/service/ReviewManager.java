package com.example.service;

import com.example.model.Book;
import com.example.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ReviewManager {
    private final Map<Book, Review> reviews = new HashMap<>();
    private Book book; // Required for setter injection

    @Autowired
    public void setBook(@Qualifier("book1") Book book) {
        this.book = book;
        System.out.println("✅ Setter Injection: Book set in ReviewManager -> " + book);
    }

    public void addReview(Book book, Review review) {
        reviews.put(book, review);
        System.out.println("⭐ Review added: " + review + " for book " + book);
    }

    public Map<Book, Review> getReviews() {
        return reviews;
    }
}