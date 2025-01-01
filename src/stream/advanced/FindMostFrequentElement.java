package stream.advanced;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Find Most Frequent Element:
 * Given a list of strings,
 * find the most frequently occurring string using streams.
 */

public class FindMostFrequentElement {
    public static void main(String[] args) {
        List<String> strings = List.of("Amy", "Bob", "Charlie", "David", "Anna", "Bob", "Alex", "Eric", "Frank", "George", "Alice", "Harry", "Ivan", "Jack");
        Optional<String> s = strings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey);
        System.out.println(s.get());
    }
}
