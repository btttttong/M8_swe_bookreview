package com.example;

import com.example.model.Book;
import com.example.model.Review;
import com.example.service.BookCatalog;
import com.example.service.ReviewManager;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.annotation.PostConstruct;

public class DataInitializer {
    private final BookCatalog bookCatalog;
    private final ReviewManager reviewManager;

    @Autowired 
    public DataInitializer(BookCatalog bookCatalog, ReviewManager reviewManager) {
        this.bookCatalog = bookCatalog;
        this.reviewManager = reviewManager;
        System.out.println("✅ Constructor Injection: DataInitializer initialized");
    }

    @PostConstruct
    public void init() {
        System.out.println("🚀 Initializing sample data...");

        Book book1 = new Book("Effective Java", "Joshua Bloch");
        Book book2 = new Book("Clean Code", "Robert C. Martin");
        Book book3 = new Book("Spring in Action", "Craig Walls");

        bookCatalog.addBook(book1);
        bookCatalog.addBook(book2);
        bookCatalog.addBook(book3);

        Review review1 = new Review("Great book on Java!", 5);
        Review review2 = new Review("Must-read for software engineers", 5);
        Review review3 = new Review("Excellent resource on Spring", 4);

        reviewManager.addReview(book1, review1);
        reviewManager.addReview(book2, review2);
        reviewManager.addReview(book3, review3);
    }
}