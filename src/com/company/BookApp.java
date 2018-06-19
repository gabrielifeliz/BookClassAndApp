package com.company;

public class BookApp {

    public static void main(String[] args) {

        Book book = new Book();

        book.setAuthor("Joel Murach");
        book.setTitle("Murach’s Java Programming");
        book.setDescription("This is the 4th Edition of our best-selling core Java book." +
                "\nSince 2001, it has been used by thousands of beginning" +
                "\nand experienced programmers to master the core language" +
                "\nskills that are needed to create console, web, and mobile" +
                "\napplications. Now, to make training even easier, this book" +
                "\nshows you how to develop Java programs using NetBeans," +
                "\na popular IDE that will boost your productivity at every step.");

        System.out.println(book.getDisplayText());
    }
}
