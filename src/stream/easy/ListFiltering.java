package stream.easy;

import java.util.List;

//Given a list of integers, use a stream to filter out odd numbers and print the remaining numbers.
public class ListFiltering {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .filter(integer -> !(integer % 2 == 1))
                .forEach(System.out::println);
    }
}
