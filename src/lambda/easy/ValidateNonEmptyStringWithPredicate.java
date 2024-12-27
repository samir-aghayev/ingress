package lambda.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
/*
 * Task 2: Validate Non-Empty Strings with Predicate Instructions:
 * Use a Predicate<String> to check if a string is non-empty.
 * Write a method that filters a list of strings based on the predicate, displaying only the non-empty strings.
 */

public class ValidateNonEmptyStringWithPredicate {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add(null);
        strings.add("World");
        strings.add("");
        strings.add("          ");
        strings.add("!");
        Predicate<String> predicate = s -> Objects.nonNull(s) && !s.isBlank();
        strings = checkStrings(strings, predicate);
        System.out.println(strings);
    }

    public static List<String> checkStrings(List<String> list, Predicate<String> condition) {
        List<String> strings = new ArrayList<>();
        list.forEach(s -> {
            if (condition.test(s)) {
                strings.add(s);
            }
        });
        return strings;
    }
}
