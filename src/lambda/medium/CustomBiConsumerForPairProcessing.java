package lambda.medium;

import java.util.Map;
import java.util.function.BiConsumer;

public class CustomBiConsumerForPairProcessing {
    public static void main(String[] args) {
        BiConsumer<Integer, String> biConsumer = (id, name) -> System.out.println(id + " " + name);
        Map<Integer, String> map = Map.of(1, "John", 2, "Jane", 3, "Jill");
        processPair(map, biConsumer);

    }

    public static void processPair(Map<Integer, String> map, BiConsumer<Integer, String> biConsumer) {
        map.forEach(biConsumer);
    }
}
