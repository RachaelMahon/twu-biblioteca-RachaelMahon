package com.twu.biblioteca;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import static org.junit.Assert.assertEquals;

/**
 * Created by rachaelmahon on 15/04/2017.
 */
public class BibliotecaAppTest {

    BibliotecaApp app =new BibliotecaApp();
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Test
    public void greeting() throws Exception {
        String greeting = "Welcome to Bangalore Public Library! Please select a menu option:";
        app.greeting();
        assertEquals(greeting, output.toString());
    }

}