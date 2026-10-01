package model;

public class Electronics extends Product {
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
}
