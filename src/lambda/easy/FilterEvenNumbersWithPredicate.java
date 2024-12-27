package lambda.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
 * Task 1: Filter Even Numbers with Predicate Instructions:
 * Use a Predicate<Integer> to filter even numbers from a list.
 * Write a method that takes a list of integers and a Predicate<Integer>, then prints only the even numbers.
 */

public class FilterEvenNumbersWithPredicate {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(15);
        integers.add(12);
        integers.add(10);
        integers.add(13);
        integers.add(2);
        integers.add(6);
        integers.add(9);
        Predicate<Integer> predicate = integer -> integer % 2 == 0;
        integers = filterEvenNumbers(integers, predicate);
        System.out.println(integers);

    }

    public static List<Integer> filterEvenNumbers(List<Integer> list, Predicate<Integer> condition) {
        List<Integer> integers = new ArrayList<>();
        list.forEach(num -> {
            if (condition.test(num)) {
                integers.add(num);
            }
        });
        return integers;
    }
}
