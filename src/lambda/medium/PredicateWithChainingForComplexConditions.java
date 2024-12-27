package lambda.medium;

import java.util.List;
import java.util.function.Predicate;

/*
 * Task 4: Predicate with Chaining for Complex Conditions Instructions:
 * Create a Predicate<String> to check if a string contains a specific substring, and another to check if its length is greater than 5.
 * Chain these predicates using .and() and .or() methods, and write a method that prints strings meeting either or both conditions from a list.
 */

public class PredicateWithChainingForComplexConditions {
    public static void main(String[] args) {
        Predicate<String> startsWithA = s -> s.toUpperCase().startsWith("A");
        Predicate<String> length = s -> s.length() >= 5;
        Predicate<String> complexAndCondition = startsWithA.and(length);
        Predicate<String> complexOrCondition = startsWithA.or(length);
        List<String> texts = List.of("AgfddsgZ", "text", "Atext3z", "atext4", "text5");
        validateUserName(texts, complexAndCondition);
        System.out.println("-----------------------------");
        validateUserName(texts, complexOrCondition);
    }

    public static void validateUserName(List<String> texts, Predicate<String> condition) {
        texts.forEach(s -> {
            if (condition.test(s)) {
                System.out.println(s);
            }
        });
    }
}
