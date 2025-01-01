package stream.advanced;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Complex Grouping and Counting:
 * Given a list of words, group them by length
 * and count the number of words in each group using streams.
 */


public class ComplexGroupingAndCounting {
    public static void main(String[] args) {
        List<String> strings = List.of("Amy", "Bob", "Charlie", "David", "Anna", "Alex", "Eric", "Frank", "George", "Alice", "Harry", "Ivan", "Jack");
        strings.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()))
                .forEach((length, count) -> System.out.println(length + " uzunluqlu " + count + "soz var"));
    }
}
