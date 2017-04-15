package com.twu.biblioteca;

/**
 * Created by rachaelmahon on 12/04/2017.
 */

import java.util.ArrayList;

public class Book_Manager {

    ArrayList<Book> availableBooks = new ArrayList<Book>();

    Book_Manager() {
        availableBooks.add(new Book("Moby Dick", "Herman Melville", 1851));
        availableBooks.add(new Book("The Handmaid's Tale", "Margaret Atwood", 1985));
        availableBooks.add(new Book("We Need to Talk about Kevin", "Lionel Shriver", 2003));
    }

    void displayBooks() {
        for (Book book : availableBooks) {
            book.prettyPrintBooksDetails();
        }
    }


    void checkoutBook(String args) {
        System.out.println(args);
    }

    void returnBook(String args) {
        System.out.println(args);
    }
}

