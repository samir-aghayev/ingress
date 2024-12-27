package lambda.medium;

/*
 * Task 2: Process List with Consumer and Predicate Instructions:
 * Use a Predicate<Integer> to filter out negative numbers, and a Consumer<Integer> to print each number multiplied by 2.
 * Write a method that first filters a list of integers using the predicate, and then processes the filtered list with the consumer.
 */

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ProcessListWithConsumerAndPredicate {
    public static void main(String[] args) {
        Predicate<Integer> predicate = integer -> integer >= 0;
        Consumer<Integer> consumer = integer -> System.out.println(integer * 2);
        List<Integer> list = List.of(-1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        processList(list, predicate, consumer);
    }

    public static void processList(List<Integer> list, Predicate<Integer> predicate, Consumer<Integer> consumer) {
        list.forEach(i -> {
            if (predicate.test(i)) {
                consumer.accept(i);
            }
        });
    }
}
