package com.example.model;

public class Review {
    private String comment;
    private int rating;

    public Review(String comment, int rating) {
        this.comment = comment;
        this.rating = rating;
    }

    public String getComment() { return comment; }
    public int getRating() { return rating; }

    @Override
    public String toString() {
        return "Review{rating=" + rating + ", comment='" + comment + "'}";
    }
}