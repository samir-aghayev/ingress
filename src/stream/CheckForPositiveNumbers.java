package stream;

import java.util.List;

/*
 * Check for Positive Numbers:
 * Given a list of integers, use a stream to check if all numbers are positive,
 * print true if they are, otherwise false.
 */
public class CheckForPositiveNumbers {
    public static void main(String[] args) {
        List<Integer> integers = List.of(-1, 5, -7, 9, -12, 45, 12);
        boolean b = integers.stream().allMatch(integer -> integer > 0);
        if (b) {
            System.out.println("All numbers are positive");
        } else {
            System.out.println("All numbers aren't positive");
        }
    }
}
