package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Collect to Set: Given a list of integers with duplicates, use a stream to remove duplicates and collect the unique values in a Set.
public class CollectToSet {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(5);
        integers.add(3);
        integers.add(3);
        integers.add(3);
        integers.add(1);
        integers.add(2);
        integers.add(2);
        integers.add(4);
        integers.add(4);
        integers.add(6);
        Set<Integer> collect = integers.stream().collect(Collectors.toSet());

        System.out.println(collect);
    }
}
