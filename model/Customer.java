package model;

import java.util.*;

public record Customer(String name, String email, String phone) {
    public Customer {
        if(name.isBlank() || !email.contains("@") || phone.isBlank()) {
            throw new IllegalArgumentException("Все поля должны быть заполнены корректно");
        }
    }
    public String getContactInfo() {
        return name + "<" + email + ">";
    }

    public class Cart {
        private List<Product> cart = new ArrayList<>();
        
        public void addItem(Product product) {
            cart.add(product);
            System.out.println(name + " добавил " + product.getName() + " в корзину");
        }

        public List<Product> getCart() {
            return this.cart;
        }
    }
}
