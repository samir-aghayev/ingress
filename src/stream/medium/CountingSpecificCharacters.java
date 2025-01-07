package stream.medium;

import java.util.List;

/**
 * Counting Specific Characters:
 * Given a list of strings, count the total occurrences
 * of a specific character (e.g., 'a') across all strings.
 */
public class CountingSpecificCharacters {
    public static void main(String[] args) {
        List<String> strings = List.of("Amy", "Bob", "Charlie", "David", "Anna", "Alex", "Eric", "Frank", "George", "Alice", "Harry", "Ivan", "Jack");
        long count = strings.stream()
                .mapToLong(string -> string.chars()
                        .filter(character -> character == 'a')
                        .count())
                .sum();
        System.out.println(count);
    }
}
