package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import static org.junit.Assert.assertEquals;

public class main_MenuTest {

    main_Menu menu = new main_Menu();
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Test
    public void display_BooksTest() throws Exception {
    }

    @Test
    public void checkoutBookTest() throws Exception {
        String checkout = "butts";
        menu.checkoutBook();
        assertEquals(checkout, output.toString());
    }

    @Test
    public void returnBookTest() throws Exception {
        String returned = "weasels";
        menu.returnBook();
        assertEquals(returned, output.toString());
    }

    @Test
    public void quit_applicationTest() throws Exception {
        String farewell = "Goodbye!";
        menu.quitApplication();
        assertEquals(farewell, output.toString());
    }

    @Test
    public void invalid_menu_optionTest() throws Exception {
        String invalid = "Your selection is invalid. Please select a valid menu option.";
        menu.invalidMenuOption();
        assertEquals(invalid, output.toString());
    }

    @Test
    public void checkoutBookTestWithNumber() throws Exception {
        String checkout = "";
        menu.interpretMenuSelection("2");
        assertEquals(checkout, output.toString());
    }

    @Test
    public void returnBookTestWithNumber() throws Exception {
        String returned = "";
        menu.interpretMenuSelection("3");
        assertEquals(returned, output.toString());
    }

    @Test
    public void quit_applicationTestWithNumber() throws Exception {
        String farewell = "Goodbye!";
        menu.interpretMenuSelection("4");
        assertEquals(farewell, output.toString());
    }

    @Test
    public void invalid_menu_optionTestWithNumber() throws Exception {
        String invalid = "Your selection is invalid. Please select a valid menu option.";
        menu.interpretMenuSelection("ferret");
        assertEquals(invalid, output.toString());
    }
}