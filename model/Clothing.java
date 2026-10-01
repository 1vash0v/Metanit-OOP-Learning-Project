package model;

public class Clothing extends Product {
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
}
