package model;
import java.util.*;

public class Order {
    private final List<Box<? extends Product>> boxes = new ArrayList<>();
    private final List<OrderItem> items = new ArrayList<>();
    private OrderStatus status = OrderStatus.NEW;
    private Customer customer;
    public Order() {

    }
    public Order(Order other) {
        this.boxes.addAll(other.boxes);
        this.status = other.status;
        this.items.addAll(other.items);
    }
    public List<OrderItem> getItems() {
        return this.items;
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
        for (OrderItem item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void addItem(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }

    public static class OrderItem {
        private final Product product;
        private final int quantity;
        public OrderItem(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }
        public double getPrice() {
            return product.getPrice() * quantity;
        }
        @Override
        public String toString() {
            return "OrderItem{product='" + product.getName() + "', quantity=" + quantity +
           ", price=" + getPrice() + "}";
        }
    }
}
