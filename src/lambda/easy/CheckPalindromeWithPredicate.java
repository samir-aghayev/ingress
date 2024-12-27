package lambda.easy;

import java.util.function.Predicate;

/*
 * Task 15: Check Palindrome with Predicate Instructions:
 * Use a Predicate<String> to check if a string is a palindrome.
 * Write a method that prints whether each string in a list is a palindrome based on the predicate.
 */

public class CheckPalindromeWithPredicate {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.contentEquals(new StringBuilder(s).reverse());
        System.out.println( predicate.test("random"));
        System.out.println( predicate.test("radar"));
    }
}
