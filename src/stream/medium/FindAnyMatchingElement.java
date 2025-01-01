package stream.medium;

import java.util.List;
import java.util.Optional;

/**
 * Find Any Matching Element:
 * Given a list of strings, use a stream to find any element
 * containing a specific substring (e.g., "java") and print it if it exists.
 */

public class FindAnyMatchingElement {
    public static void main(String[] args) {
        List<String> strings = List.of("Amy", "Bob", "Charlie", "David", "Anna", "Alex", "Eric", "Frank", "George", "Alice", "Harry", "Ivan", "Jack");
        Optional<String> bob = strings.stream()
                .filter(s -> s.equalsIgnoreCase("bob"))
                .findAny();
        System.out.println(bob.get());
    }
}
