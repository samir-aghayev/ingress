package lambda.medium;
/*
 * Task 1: Combine Predicates for Complex Validation Instructions:
 * Use two Predicate<String> instances: one to check if a string starts with a specific letter, and another to check if it ends with a specific letter.
 * Write a method that accepts both predicates and a list of strings, and prints those that satisfy both conditions (e.g., starts with "A" and ends with "Z").
 */

import java.util.List;
import java.util.function.Predicate;

public class CombinePredicatesForComplexValidation {
    public static void main(String[] args) {
        Predicate<String> startsWithA = s -> s.toUpperCase().startsWith("A");
        Predicate<String> endsWithZ = s -> s.toUpperCase().endsWith("Z");
        Predicate<String> complexCondition = startsWithA.and(endsWithZ);
        List<String> texts = List.of("AgfddsgZ", "text", "Atext3z", "atext4", "text5");
        validateUserName(texts, complexCondition);

    }

    public static void validateUserName(List<String> texts, Predicate<String> condition) {
        texts.forEach(s -> {
            if (condition.test(s)) {
                System.out.println(s + " starts with \"A\" and ends with \"Z\"");
            }
        });
    }
}
