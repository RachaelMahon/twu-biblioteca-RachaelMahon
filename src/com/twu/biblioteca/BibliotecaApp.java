package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        app.greeting();
        main_Menu menu = new main_Menu();
        menu.runMenu();
    }

    void greeting(){
        System.out.println("Welcome to Bangalore Public Library! Please select a menu option:");
    }
}
