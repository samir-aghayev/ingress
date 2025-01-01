package stream.easy;

import java.util.Comparator;
import java.util.List;

//Maximum Number: Given a list of integers,
// use a stream to find and print the maximum number.
// Handle empty lists with Optional.
public class MaximumNumber {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 4, 3, 7, 19, 32, 6, 9, 15);
        integers.stream()
                .max(Comparator.naturalOrder())
                .ifPresentOrElse(integer -> System.out.println(integer), () -> System.out.println("not found max number"));
    }
}
