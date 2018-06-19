package com.company;

public class BookDatabase {

    private Book book;

    public BookDatabase() {

    }
    public BookDatabase(String sku)  {
        setBook(sku);
    }

    public Book getBook() {
        return book;
    }

    public void setBook(String sku) {
        switch (sku) {
            case "Java1001" : this.book = new Book(
                    "Java1001",
                    "Head First Java",
                    "Kathy Sierra and Bert Bates",
                    "Easy to read Java workbook",
                    47.50);
                break;
            case "Java1002" : this.book = new Book(
                    "Java1002",
                    "Thinking in Java",
                    "Bruce Eckel",
                    "Details about Java under the hood",
                    20.00);
                break;
            case "Orcl1003" : this.book = new Book(
                    "Orcl1003",
                    "OCP: Oracle Certified Professional Java SE",
                    "Jeanne Boyarsky",
                    "Everything you need to know in one place",
                    45.00);
                break;
            case "Python1004" : this.book = new Book(
                    "Python1004",
                    "Automate the Boring Stuff with Python",
                    "Al Sweigart",
                    "Fun with Python",
                    10.50);
                break;
            case "Zombie1005" : this.book = new Book(
                    "Zombie1005",
                    "The Maker's Guide to the Zombie Apocalypse",
                    "Simon Monk",
                    "Defend Your Base with Simple Circuits, " +
                            "Arduino, and Raspberry Pi",
                    16.50);
                break;
            case "Rasp1006" : this.book = new Book(
                    "Rasp1006",
                    "Raspberry Pi Projects for the Evil Genius",
                    "Donald Norris",
                    "A dozen fiendishly fun projects " +
                            "for the Raspberry Pi!",
                    14.75);
                break;
            default: this.book = new Book();
        }
    }
}
