package lambda.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
/*
 * Task 5: Print All Uppercase Strings with Consumer Instructions:
 * Use a Consumer<String> to print each string in uppercase.
 * Write a method that takes a list of strings and applies the consumer to print all in uppercase.
 */

public class PrintAllUppercaseStringsWithConsumer {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("world");
        words.add("ranDOM");
        words.add("Lucky-S");
        words.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                "\nLorem Ipsum has been the industry 's standard dummy text ever since the 1500s," +
                "\nwhen an unknown printer took a galley of type and scrambled it to make a type");
        words.add("specimen book. It has survived not only five centuries, but also the leap into" +
                "\nelectronic typesetting, remaining essentially unchanged. It was popularised in the" +
                "\n1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more" +
                "\nrecently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());

        printAllUppercaseString(words, consumer);
    }

    public static void printAllUppercaseString(List<String> words, Consumer<String> consumer) {
        words.forEach(consumer);
    }
}
