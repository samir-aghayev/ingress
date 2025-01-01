package stream.easy;
//Uppercase Conversion: Given a list of names, use a stream to convert all names to uppercase and print them.

import java.util.List;

public class UppercaseConversion {
    public static void main(String[] args) {
        List<String> strings = List.of("name1", "name2", "name3", "name4");

        strings.stream()
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));
    }
}
