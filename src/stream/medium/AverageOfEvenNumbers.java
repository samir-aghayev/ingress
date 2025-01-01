package stream.medium;

import java.util.List;
import java.util.OptionalDouble;

public class AverageOfEvenNumbers {
    /*
     * Average of Even Numbers:
     * Given a list of integers, calculate and print the average of
     * all even numbers using streams. Handle cases where no even numbers exist.
     */

    public static void main(String[] args) {
        List<Integer> list = List.of(2, 8, 6, 9, 4, 6);

        //fist
        OptionalDouble average = list.stream()
                .filter(integer -> integer % 2 == 0)
                .mapToDouble(Double::valueOf)
                .average();
        System.out.println(average.getAsDouble());


        //second
        OptionalDouble reduce = list.stream()
                .filter(integer -> integer % 2 == 0)
                .mapToDouble(Double::valueOf)
                .reduce((value1, value2) -> (value1 + value2) / 2.0);
        System.out.println(reduce.getAsDouble());

    }
}
