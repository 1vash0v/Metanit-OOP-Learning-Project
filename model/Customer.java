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

    public static class Cart {
        private List<Product> cart = new ArrayList<>();
        private Customer customer;
        public Cart(Customer customer) {
            this.customer = customer;
        }
        public void addItem(Product product) {
            cart.add(product);
            System.out.println(customer.name() + " Добавил " + product.getName());
        }

        public List<Product> getCart() {
            return this.cart;
        }
    }
}
