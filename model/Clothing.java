package model;

import service.Returnable;

public class Clothing extends Product implements  Returnable {
    private int size;

    public Clothing(int id, String name, double price, int size) {
        super(id, name, price);
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    @Override 
    public String getCategory() {
        return "Clothing";
    }

    @Override
    public String returnItem(String reason) {
        return "Товар " + getName() + " возвращен. Причина: " + reason;
    }
}
