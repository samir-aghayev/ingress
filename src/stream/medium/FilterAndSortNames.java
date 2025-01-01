package stream.medium;


import java.util.List;

/**
 * Filter and Sort Names:
 * Given a list of names, use a stream to filter names starting with a
 * specific letter (e.g., "A") and sort them alphabetically.
 */
public class FilterAndSortNames {
    public static void main(String[] args) {
        List<String> names = List.of("Amy", "Bob", "Charlie", "David", "Anna", "Alex", "Eric", "Frank", "George", "Alice", "Harry", "Ivan", "Jack");
        List<String> filteredNames = names.stream()
                .filter(s -> s.startsWith("A"))
                .sorted()
                .toList();
        System.out.println(filteredNames);
    }
}
