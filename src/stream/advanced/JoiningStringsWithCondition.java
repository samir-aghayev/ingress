package stream.advanced;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Joining Strings with Condition:
 * Given a list of strings, use a stream to join them with commas,
 * excluding strings with length less than 3.
 */

public class JoiningStringsWithCondition {
    public static void main(String[] args) {
        List<String> strings = List.of("Amy", "Bob", "Charlie", "David", "Anna", "Alex", "Eric", "Frank", "George", "Alice", "Harry", "Ivan", "Jack");

        String collect = strings.stream()
                .filter(s -> s.length() >= 3)
                .collect(Collectors.joining(", "));
        System.out.println(collect);
    }
}
