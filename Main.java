import model.*;
import service.ProductUtils;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Order order1 = new Order();

        // Box<Product> box1 = new Box<>();
        //Box<Product> box2 = new Box<>();
        Electronics el1 = new Electronics(19, "Iphone", 199.9, 12);
        Electronics el2 = new Electronics(18, "Samsung", 1, 18);
        Electronics el3 = new Electronics(18, "Samsung", 101, 18);
        Book el4 = new Book(3, "Tail", 50, "Gaben");
        // box1.add(el1);
        // box2.add(el2);

        // order1.addBox(box1);
        // order1.addBox(box2);
        // Order copyOrder = new Order(order1);
        // copyOrder.addBox(box2);
        // System.out.println(order1.getTotalPrice());
        // System.out.println(order1.getBoxes().size());
        // System.out.println(copyOrder.getBoxes().size());

        // Customer customer = new Customer("Nikita", "test@mail.ru", "123123123");
        // order1.setCustomer(customer);
        // System.out.println(order1.getCustomer().getContactInfo());
        // Customer customer3 = new Customer("Nikita", "test@mail.ru", "123123123");
        // System.out.println(customer.equals(customer3));

        List<Product> list = List.of(el1, el2, el3, el4);
        System.out.println(ProductUtils.filterProductsByPrice(list, p -> p.getPrice() > 100).size());
        System.out.println(ProductUtils.formatter(list, p -> "Новый объект - " + p.toString()));
        ProductUtils.consumer(list, p -> System.out.println(p.getCategory() + ":" + p.getName()));
        System.out.println(ProductUtils.findFirst(list, p -> p.getCategory() == "Books"));
        System.out.println(ProductUtils.totalPrice(list));
    }
}
