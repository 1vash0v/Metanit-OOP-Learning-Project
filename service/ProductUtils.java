package service;
import java.util.*;
import java.util.function.*;

import model.*;
public class ProductUtils {
    public static List<Product> filterProductsByPrice(List<Product> items, Predicate<Product> condition) {
        List<Product> result = new ArrayList<>();
        for(Product item : items) {
            if(condition.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static <R> List<R> formatter(List<Product> items, Function<Product, R> mapper) {
        List<R> result = new ArrayList<>();
        for(Product item : items) {
            result.add(mapper.apply(item));
        }
        return result;
    }

    public static void consumer(List<Product> items, Consumer<Product> condition) {
        for(Product item : items) {
            condition.accept(item);
        }
    }

    public static Optional<Product> findFirst(List<Product> items, Predicate<Product> condition) {
        for(Product item : items) {
            if(condition.test(item)) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }

    public static double totalPrice(List<Product> items) {
        double totalPrice = 0;
        for(Product item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
