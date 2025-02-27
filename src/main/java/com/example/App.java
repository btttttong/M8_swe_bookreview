package com.example;

import com.example.config.AppConfig;
import com.example.service.BookCatalog;
import com.example.service.ReviewManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            System.out.println("Spring Application Started!");

            // Get beans
            BookCatalog bookCatalog = context.getBean(BookCatalog.class);
            ReviewManager reviewManager = context.getBean(ReviewManager.class);

            // Print books
            System.out.println("\n📚 Books in Catalog:");
            bookCatalog.getBooks().forEach(System.out::println);

            // Print reviews
            System.out.println("\n⭐ Reviews:");
            reviewManager.getReviews().forEach((book, review) ->
                System.out.println(book.getTitle() + " -> " + review)
            );
        }
    }
}