package com.company;

public class Book {

    private String sku;
    private String author;
    private String title;
    private String description;
    private String price;
    private boolean isInStock;

    public Book() {

    }

    // Book constructor for book database
    public Book(String sku, String title,
                String author, String description, double price) {

        this.sku = sku;
        this.author = author;
        this.title = title;
        this.description = description;
        this.price = String.format("%.02f", price);
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

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDisplayText() {
        return "Author:\n" + author + "\n\nTitle:\n" + title
                + "\n\nDescription:\n" + description;
    }

    public String getPricing(int quantity) {
        if (isInStock) {
            double total = Double.parseDouble(price) * quantity;
            String totalPrice = String.format("%.02f", total);
            return "The total price is $" + totalPrice;
        } else {
            return "The book is out of stock";
        }
    }
}
