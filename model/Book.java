package model;

public final class Book extends Product {
    private final String author;

    public Book(int id, String name, double price, String author) {
        super(id, name, price);
        this.author = author;
    }
    public String getAuthor() {
        return this.author;
    }
    

    @Override 
    public String getCategory() {
        return "Books";
    }
}
