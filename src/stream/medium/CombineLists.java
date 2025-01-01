package stream.medium;

/*
 * Combine Lists:
 * Given two lists of integers, merge them, remove duplicates,
 * and sort them in ascending order using streams.
 */

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CombineLists {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 3, 4, 5, 7, 8, 9);
        List<Integer> list2 = List.of(2, 3, 4, 6, 7, 8, 10);
        List<Integer> margedList = Stream.of(list1, list2)
                .flatMap(Collection::stream)
                .distinct()
                .sorted()
                .toList();
        System.out.println(margedList);
    }
}
