package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by rachaelmahon on 12/04/2017.
 */
public class main_Menu {

    private Book_Manager library;

    void runMenu(){
        displayOptions();
        String selection = getInput();
        interpretMenuSelection(selection);
    }

    void displayOptions() {
        System.out.println("Main Menu - Please type the number of your selection \n" +
                            "1. Display available books \n" +
                            "2. Checkout book\n" +
                            "3. Return book \n" +
                            "4. Exit\n");
    }

    String getInput() {
        Scanner menu_selection = new Scanner(System.in);
        return menu_selection.nextLine();
    }

    void interpretMenuSelection(String input) {
        if(input.equals("1")) {
            library.displayBooks();
            runMenu();
        } else if(input.equals("2")){
            checkoutBook();
            runMenu();
        } else if(input.equals("3")){
            returnBook();
            runMenu();
        } else if(input.equals("4")) {
            quitApplication();
        } else {
            invalidMenuOption();
            runMenu();
        }
    }

    void checkoutBook() {
        System.out.println("What is the title of the book you wish to checkout?:");
        String book = getInput();
        library.checkoutBook(book);
    }

    void returnBook() {
        System.out.println("What is the title of the book you wish to return?:");
        String book = getInput();
        library.returnBook(book);
    }

    void quitApplication () {
        System.out.println("Goodbye!");
    }

    void invalidMenuOption () {
        System.out.println("Your selection is invalid. Please select a valid menu option.");
    }
}
