package com.twu.biblioteca;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;
import static org.junit.Assert.assertEquals;
import java.io.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;



public class main_MenuTest {

    private final ByteArrayOutputStream myOut = new ByteArrayOutputStream();

    @Test
    public void GreetingTest() throws Exception {
        main_Menu main_Menu = new main_Menu();
        assertThat(myOut.toString(),"Welcome to the Bangalore Public Library - Please select a menu option");
    }

    @Test
    public void display_BooksTest() throws Exception {

    }

    @Test
    public void quit_applicationTest() throws Exception {

    }

    @Test
    public void invalid_menu_optionTest() throws Exception {

    }

}