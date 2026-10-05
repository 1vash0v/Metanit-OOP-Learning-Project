package model;

import service.Shippable;

public final class Electronics extends Product implements Shippable {
    private int warrantyMonths;

    public Electronics(int id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }
    public int getWarrantyMonths() {
        return this.warrantyMonths;
    }
    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override 
    public String getCategory() {
        return "Electronics";
    }
    
    @Override
    public double calculateShippingCost() {
        return 100 + getPrice() * 0.01;
    }
}
