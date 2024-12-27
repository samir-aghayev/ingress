package lambda.medium;

import java.util.ArrayList;
import java.util.List;

/*
 * Task 3: Custom Functional Interface for Transformation Instructions:
 * Create a custom functional interface Transformer<T> with a method transform(T input) that returns a transformed version of the input.
 * Implement it using lambdas to perform different transformations on strings, such as reversing, converting to uppercase, and adding a suffix.
 * Write a method that accepts a list of strings and applies different transformers to each string.
 */
 interface Transformer<T> {
    T transform(T input);
}

public class CustomFunctionalInterfaceForTransformation {
    public static void main(String[] args) {
        Transformer<String> transformStringToReverse = input -> new StringBuilder(input).reverse().toString();
        Transformer<String> transformStringToUppercase = input -> input.toUpperCase();
        Transformer<String> transformStringAddingSuffix = input -> input.concat(" transformed");

        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("lambda");
        strings.add("java");

        transformStrings(strings, transformStringToReverse);
        transformStrings(strings, transformStringToUppercase);
        transformStrings(strings, transformStringAddingSuffix);

    }

    public static <T> void transformStrings(List<T> strings, Transformer<T> transformer) {
        strings.forEach(s -> System.out.println(transformer.transform(s)));
    }
}
