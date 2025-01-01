package stream.medium;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Grouping by First Letter:
 * Given a list of strings, group them by their
 * first letter using Collectors.groupingBy.
 */

public class GroupingByFirstLetter {
    public static void main(String[] args) {
        List<String> strings = List.of("Amy", "Bob", "Charlie", "David", "Anna", "Alex", "Eric", "Frank", "George", "Alice", "Harry", "Ivan", "Jack");

        Map<String, List<String>> collect = strings.stream()
                .collect(Collectors.groupingBy(s -> s.substring(0, 1)));


        System.out.println(collect);
    }
}
