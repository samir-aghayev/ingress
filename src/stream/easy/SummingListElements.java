package stream.easy;

import java.util.List;

//Summing List Elements: Use a stream to sum all elements in a list of doubles and print the result.
public class SummingListElements {
    public static void main(String[] args) {
        List<Double> list = List.of(12.3, 2.1, 1.0, 3d, 13.5);
        Double sum = list.stream()
                .reduce(0d, Double::sum);
        System.out.println(sum);
    }
}
