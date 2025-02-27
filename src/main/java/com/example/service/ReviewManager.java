package com.example.service;

import com.example.model.Book;
import com.example.model.Review;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ReviewManager {
    private final Map<Book, Review> reviews = new HashMap<>();

    public void addReview(Book book, Review review) { 
        reviews.put(book, review);
        System.out.println("Review added: " + review + " for book " + book);
    }

    public Map<Book, Review> getReviews() {
        return reviews;
    }
}