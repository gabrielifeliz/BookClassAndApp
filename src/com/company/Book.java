package com.company;

public class Book {
    private String author;
    private String title;
    private String description;
    private String price;
    private boolean isInStock;

    public Book() {

    }

    public Book(String author, String title,
                String description, double price, boolean isInStock) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.price = String.format("%.02f", price);
        this.isInStock = isInStock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = String.format("%.02f", price);
    }

    public boolean getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(boolean isInStock) {
        this.isInStock = isInStock;
    }

    public String getDisplayText() {
        return "Author:\n" + author + "\n\nTitle:\n" + title
                + "\n\nDescription:\n" + description;
    }
}
