package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by rachaelmahon on 12/04/2017.
 */
public class BookTest {

    Book mobyDick = new Book("Moby Dick", "Herman Melville", 1851);
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Test
    public void hasAName() {
        String name = "Moby Dick";
        assertEquals(mobyDick.name, name);
    }

    @Test
    public void hasAnAuthor() {
        String author = "Herman Melville";
        assertEquals(mobyDick.author, author);
    }

    @Test
    public void hasAYearOfPublication() {
        Integer yearOfPublication = 1851;
        assertEquals(mobyDick.year_of_publication, yearOfPublication);
    }

    @Test
    public void testPrettyPrint() {
        String printedDetails = "Moby Dick | Herman Melville | 1851";
        mobyDick.prettyPrintBooksDetails();
        assertEquals(printedDetails, output.toString());
    }
}