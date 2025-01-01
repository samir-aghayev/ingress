package stream.advanced;

import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Summarising Statistics:
 * Given a list of integers, use streams to
 * summarise and print statistics like count, sum, min, max, and average.
 */
public class SummarisingStatistics {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        IntSummaryStatistics intSummaryStatistics = integers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        long count = intSummaryStatistics.getCount();
        long sum = intSummaryStatistics.getSum();
        int min = intSummaryStatistics.getMin();
        int max = intSummaryStatistics.getMax();
        double average = intSummaryStatistics.getAverage();
        System.out.println("count: " + count);
        System.out.println("sum: " + sum);
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("average " + average);
    }
}
