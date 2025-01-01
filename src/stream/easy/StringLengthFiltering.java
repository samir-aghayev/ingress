package stream.easy;

import java.util.List;

//String Length Filtering: Given a list of strings, use a stream to find and print all strings with length greater than 5.
public class StringLengthFiltering {
    public static void main(String[] args) {
        List<String> strings = List.of("name", "name2", "name3", "name4");
        strings.stream()
                .filter(s -> s.length() >= 5)
                .forEach(s -> System.out.println(s));
    }
}
