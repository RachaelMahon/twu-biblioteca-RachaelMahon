package com.twu.biblioteca;

/**
 * Created by rachaelmahon on 12/04/2017.
 */
public class main_Menu {
    public static void main () {
        System.out.println("Welcome to the Bangalore Public Library - Please select a menu option");
    }

    public static void Greeting () {
        System.out.println("Welcome to the Bangalore Public Library - Please select a menu option");
    }

    public static void display_Books () {
        Book_Manager book_manager = new Book_Manager();
        book_manager.display_books();
    }

    public static void quit_application () {
        System.out.println("Goodbye!");
    }

    public static void invalid_menu_option () {
        System.out.println("Your selection is invalid. Please select a valid menu option.");
    }

}
