package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import static org.junit.Assert.assertEquals;

/**
 * Created by rachaelmahon on 12/04/2017.
 */
public class Book_ManagerTest {

    Book_Manager library = new Book_Manager();
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();


    @Test
    public void displayBooks() throws Exception {
        library.displayBooks();
        String libraryBooks = "Moby Dick | Herman Melville | 1851\n\"The Handmaid's Tale\", \"Margaret Atwood\", 1985\"We Need to Talk about Kevin\", \"Lionel Shriver\", 2003";
        assertEquals(libraryBooks, output.toString());
    }

    @Test
    public void checkoutBook() throws Exception {

    }

    @Test
    public void returnBook() throws Exception {

    }


}