package lambda.easy;
/*
 * Task 9: Check String Length with Predicate Instructions:
 * Use a Predicate<String> to check if a string has more than 5 characters.
 * Write a method that accepts a list of strings and prints those that meet the condition.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CheckStringLengthWithPredicate {
    public static void main(String[] args) {
        List<String> texts = new ArrayList<>();
        texts.add("text1");
        texts.add("text1");
        texts.add("text1");
        texts.add("text1");
        texts.add("text1");
        texts.add("user");

        Predicate<String> predicate = s -> s.length() > 5;

        validateUserName(texts, predicate);

    }

    public static void validateUserName(List<String> texts, Predicate<String> condition) {
        texts.forEach(s -> {
            if (condition.test(s)) {
                System.out.println(s);
            }
        });
    }
}

