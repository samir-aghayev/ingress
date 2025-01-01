package stream.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Parallel Stream Experiment:
 * Given a large list of integers, use parallel streams
 * to perform filtering and print the filtered list.
 * Compare performance with sequential streams.
 */
public class ParallelStreamExperiment {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        fillTheList(integers);


        long parallelStreamStartTime = System.currentTimeMillis();
        List<Integer> parallelList = integers.parallelStream()
                .filter(integer -> integer > 50_000)
                .toList();

        long parallelStreamEndTime = System.currentTimeMillis();
        long parallelStreamPerformanceTime = parallelStreamEndTime - parallelStreamStartTime;
        System.out.println("parallel stream performance time: " + parallelStreamPerformanceTime);


        long streamStartTime = System.currentTimeMillis();
        List<Integer> list = integers.stream()
                .filter(integer -> integer > 50_000)
                .toList();

        long streamEndTime = System.currentTimeMillis();
        long streamPerformanceTime = streamEndTime - streamStartTime;
        System.out.println("normal stream performance time: " + streamPerformanceTime);
    }


    private static void fillTheList(List<Integer> integers) {
        for (int i = 0; i < 100_000_000; i++) {
            integers.add(new Random().nextInt(100_000));
        }
    }
}
