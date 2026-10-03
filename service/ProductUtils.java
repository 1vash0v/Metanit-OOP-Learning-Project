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
    public static List<Object> formatter(List<Product> items, Function<Product, Object> condition) {
        List<Object> result = new ArrayList<>();
        for(Product item : items) {
            result.add(condition.apply(item));
        }
        return result;
    }
    public static void consumer(List<Product> items, Consumer<Product> condition) {
        for(Product item : items) {
            item.setName("Name - " + String.valueOf(item.getId()));
        }
    }
}
