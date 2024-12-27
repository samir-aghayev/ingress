package stream;

import java.util.List;

//Count of Even Numbers: Given a list of integers, use a stream to count how many are even.
public class CountOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long count = integers.stream()
                .filter(integer -> integer % 2 == 0)
                .count();
        System.out.println(count);

    }
}
