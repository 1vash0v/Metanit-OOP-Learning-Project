import model.*;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();

        Box<? super Product> box1 = new Box<>();
        Box<? super Product> box2 = new Box<>();
        Electronics el1 = new Electronics(19, "Iphone", 199.9, 12);
        Electronics el2 = new Electronics(18, "Samsung", 160.9, 18);

        box1.add(el1);
        box2.add(el2);

        order1.addBox(box1);
        order1.addBox(box2);

        System.out.println(order1.getTotalPrice());
    }
}
