package model;
import java.util.*;

public class Order {
    private final List<Box<? extends Product>> boxes = new ArrayList<>();
    private OrderStatus status = OrderStatus.NEW;
    private Customer customer;
    public Order() {

    }
    public Order(Order other) {
        this.boxes.addAll(other.boxes);
        this.status = other.status;
    }

    public Customer getCustomer() {
        return this.customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public List<Box<? extends Product>> getBoxes() {
        return boxes;
    }
    
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void addBox(Box<? extends Product> box) {
        boxes.add(box);
    }
    public double getTotalPrice() {
        double totalPrice = 0;
        for(Box<? extends Product> box : boxes) {
            totalPrice += box.getTotalPrice();
        }
        return totalPrice;
    }

    public static class OrderItem {
        private Product product;
        private int quantity;
        public OrderItem(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }
        public double getPrice() {
            return product.getPrice() * quantity;
        }
    }
}
