package lambda.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
/*
 * Task 8: Perform Calculation with Consumer Instructions:
 * Create a Consumer<Integer> to square each number in a list.
 * Write a method that accepts the list of numbers and applies the consumer to display the square of each number.
 */


public class PerformCalculationWithConsumer {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(15);
        integers.add(25);
        integers.add(5);
        integers.add(4);
        integers.add(16);
        integers.add(19);
        Consumer<Integer> consumer = integer -> System.out.println("Num: " + integer + ",  perform num: " + (int) Math.pow(integer, 2));
        squareCalculate(integers, consumer);
    }

    public static void squareCalculate(List<Integer> list, Consumer<Integer> consumer) {
        list.forEach(consumer);
    }
}
