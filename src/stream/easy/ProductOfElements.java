package stream.easy;

import java.util.List;

//Product of Elements: Given a list of integers, use a stream to find the product of all elements and print it.
public class ProductOfElements {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 4, 5, 16, 127, 13);
        Integer product = integers.stream()
                .reduce(1, (num1, num2) -> num1 * num2);
        System.out.println(product);
    }
}
