package stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Find First Element: Given a list of integers,
// use a stream to find and print the first number greater than 10.
// Use Optional to handle cases where no number matches.
public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 5, 10, 19, 11, 21);
        Optional<Integer> first = integers.stream()
                .filter(integer -> integer > 10)
                .min(Comparator.naturalOrder());
        first.ifPresentOrElse(integer -> System.out.println(integer), () -> System.out.println("No number greater than 10"));
    }
}
