package stream.medium;

import java.util.List;

/**
 * Skip and Limit:
 * Given a list of integers, skip the first 3 elements
 * and limit the output to the next 5 elements using streams.
 */


public class SkipAndLimit {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integers.stream()
                .skip(3)
                .limit(5)
                .forEach(integer -> System.out.print(integer+" "));
    }
}
