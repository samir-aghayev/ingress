package stream.advanced;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Flatten Nested Collections:
 * Given a list of lists of integers,
 * use streams to flatten them into a single sorted list of unique integers.
 */

public class FlattenNestedCollections {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(List.of(1, 6, 11, 16, 21));
        lists.add(List.of(2, 7, 12, 17, 22));
        lists.add(List.of(3, 8, 13, 18, 23));
        lists.add(List.of(4, 9, 14, 19, 24));
        lists.add(List.of(5, 10, 15, 20, 25));

        List<Integer> list = lists.stream()
                .flatMap(Collection::stream)
                .distinct()
                .sorted()
                .toList();
        System.out.println(list);
    }
}
