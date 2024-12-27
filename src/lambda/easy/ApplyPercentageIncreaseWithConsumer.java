package lambda.easy;

/*
 * Task 13: Apply Percentage Increase with Consumer Instructions:
 * Use a Consumer<Double> to increase each product's price by 5%.
 * Write a method that processes a list of product prices using the consumer to show updated prices.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ApplyPercentageIncreaseWithConsumer {
    public static void main(String[] args) {
    List<Double> prices = new ArrayList<>();
        prices.add(15.9);
        prices.add(25.7);
        prices.add(17.2);
        prices.add(15d);
        prices.add(46.9);
        prices.add(105.6);
        prices.add(16.6);
    Consumer<Double> consumer = price -> System.out.println("Old price: " + price + ", Discounted price: " + (price * 1.05));
    discountPrice(prices, consumer);
}

public static void discountPrice(List<Double> prices, Consumer<Double> consumer) {
    prices.forEach(consumer);
}
}
