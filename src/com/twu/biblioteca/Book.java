package com.twu.biblioteca;

/**
 * Created by rachaelmahon on 12/04/2017.
 */
public class Book {

    String name;
    String author;
    Integer year_of_publication;
    boolean isAvailable;

    Book(String name, String author, Integer year_of_publication) {
        this.name = name;
        this.author = author;
        this.year_of_publication = year_of_publication;
        isAvailable = true;
    }

    void prettyPrintBooksDetails() {
        System.out.println( name + " | " + author + " | " + year_of_publication);
    }
}
