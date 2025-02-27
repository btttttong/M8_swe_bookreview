package com.example.service;

import com.example.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookCatalog {
    private final List<Book> books = new ArrayList<>();

    @Autowired // ✅ Field Injection for ReviewManager
    private ReviewManager reviewManager;

    public void addBook(Book book) {
        books.add(book);
        System.out.println("📚 Added book: " + book);
    }

    public List<Book> getBooks() {
        return books;
    }
}