package stream.medium;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Longest String:
 * Given a list of strings, find the longest one using streams. Use Optional to handle empty lists.
 */
public class LongestString {
    public static void main(String[] args) {
        List<String> names = List.of("Amy", "Bob", "Charlie", "David", "Anna", "Alex", "Eric", "Frank", "George", "Alice", "Harry", "Ivan", "Jack");
        Optional<String> max = names.stream()
                .max(Comparator.comparingInt(String::length));
        max.ifPresentOrElse(s -> System.out.println("Long string: " + s), () -> System.out.println("not found"));
    }
}
