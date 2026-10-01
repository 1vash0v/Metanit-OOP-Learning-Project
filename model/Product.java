package model;
public abstract class Product {
    private final int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public final int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getCategory();
    public final  double getPriceWithDiscount(double discountPercent) {
        if(discountPercent < 0 || discountPercent > 1) {
            throw new IllegalArgumentException("Скидка должна быть в диапозоне от 0 до 1");
        }
        return this.price * (1 - discountPercent);
    }
}

