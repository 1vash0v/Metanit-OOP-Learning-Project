package model;
import java.util.*;

public class Order {
    private final List<Box<? extends Product>> boxes = new ArrayList<>();
    private OrderStatus status = OrderStatus.NEW;
    
    public Order() {

    }
    public Order(Order other) {
        this.boxes.addAll(other.boxes);
        this.status = other.status;
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
}
