package model;

import service.Returnable;
import service.Shippable;

public final class Book extends Product implements  Returnable, Shippable {
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

    @Override
    public double calculateShippingCost() {
        return 100 + getPrice() * 0.01;
    }
    
    @Override
    public String returnItem(String reason) {
        return "Книга " + getName() + " возвращена. Причина: " + reason;
    }
    
}
