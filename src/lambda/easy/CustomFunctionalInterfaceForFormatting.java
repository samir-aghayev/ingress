package lambda.easy;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

/*
 * Task 14: Custom Functional Interface for Formatting Instructions:
 * Create a custom functional interface Formatter with a method format(String input).
 * Implement it using a lambda to convert the input string to title case.
 */
interface Formatter {
    String format(String input);
}

public class CustomFunctionalInterfaceForFormatting {
    public static void main(String[] args) {
        Formatter formatter = input -> {
            if (Objects.isNull(input) || input.isBlank()) {
                return input;
            }
            return Arrays.stream(input.split(" "))
                    .map(s -> (s.substring(0, 1).toUpperCase() + s.substring(1)))
                    .collect(Collectors.joining(" "));
        };
        System.out.println(formatter.format("hello world"));
        System.out.println(formatter.format(""));
    }

}
