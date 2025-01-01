package stream.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Optional Stream of Optionals:
 * Given a list of Optional<String> elements, filter out empty optionals,
 * convert remaining strings to uppercase, and collect them in a list.
 */
public class OptionalStreamOfOptionals {
    public static void main(String[] args) {
        List<Optional<String>> list = new ArrayList<>();
        list.add(Optional.of("Hello"));
        list.add(Optional.of("world"));
        list.add(Optional.of(""));
        list.add(Optional.of("  "));
        list.add(Optional.of("Java"));
        list.add(Optional.of("Programming"));
        list.add(Optional.empty());

        List<String> optionalValueList = list.stream()
                .filter(s -> s.isPresent() && !s.get().isBlank())
                .map(s -> s.get().toUpperCase())
                .toList();

        System.out.println(optionalValueList);

    }
}
