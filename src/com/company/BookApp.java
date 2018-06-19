package com.company;

public class BookApp {

    public static void main(String[] args) {

        Book javaBook = new Book("Joel Murach", "Murach’s Java Programming",
                "This is the 4th Edition of our best-selling core Java book." +
                "\nSince 2001, it has been used by thousands of beginning" +
                "\nand experienced programmers to master the core language" +
                "\nskills that are needed to create console, web, and mobile" +
                "\napplications. Now, to make training even easier, this book" +
                "\nshows you how to develop Java programs using NetBeans," +
                "\na popular IDE that will boost your productivity at every step.",
                52.50, true);


        System.out.println(javaBook.getDisplayText() + "\n");

        // Add a method to the Book Class
        System.out.println(javaBook.getPricing(4) + "\n\n");


        // Create BookDatabase object to search book in the "database"
        BookDatabase bookDatabase = new BookDatabase();
        bookDatabase.setBook("Zombie1005");
        Book bookFromDatabase1 = bookDatabase.getBook();

        // Returned book 1 from "database"
        System.out.println(bookFromDatabase1.getDisplayText() + "\n\n");


        bookDatabase = new BookDatabase("Java1001");
        Book bookFromDatabase2 = bookDatabase.getBook();
        // Returned book 2 from "database"
        System.out.println(bookFromDatabase2.getDisplayText());


    }
}