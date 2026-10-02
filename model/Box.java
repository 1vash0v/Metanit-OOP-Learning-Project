package model;

import java.util.*;

public class Box<T extends Product> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }
    public double getTotalPrice() {
        double totalPrice = 0;
        for(T item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
