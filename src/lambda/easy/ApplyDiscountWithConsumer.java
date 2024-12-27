package lambda.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
 * Task 4: Apply Discount with Consumer Instructions:
 * Use a Consumer<Double> to apply a discount to product prices.
 * Write a method that accepts a list of prices and a Consumer<Double> to reduce each price by 10%.
 */


public class ApplyDiscountWithConsumer {
    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>();
        prices.add(15.9);
        prices.add(25.7);
        prices.add(17.2);
        prices.add(15d);
        prices.add(46.9);
        prices.add(105.6);
        prices.add(16.6);
        Consumer<Double> consumer = price -> System.out.println("Old price: " + price + ", Discounted price: " + (price * 0.9));
        discountPrice(prices, consumer);
    }

    public static void discountPrice(List<Double> prices, Consumer<Double> consumer) {
        prices.forEach(consumer);
    }
}
