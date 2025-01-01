package stream.advanced;

import java.util.List;

/**
 * Custom Comparator Sorting:
 * Given a list of strings, sort them by their length in descending
 * order using a custom comparator within the stream pipeline.
 */
public class CustomComparatorSorting {
    public static void main(String[] args) {
        List<String> strings = List.of("Amy", "Bob", "Charlie", "David", "Anna", "Alex", "Eric", "Frank", "George", "Alice", "Harry", "Ivan", "Jack");
        strings.stream()
                .sorted((o1, o2) -> Integer.compare(o2.length(), o1.length()))
                .forEach(System.out::println);
    }
}
