package stream.medium;

import java.text.MessageFormat;
import java.util.Comparator;
import java.util.List;

/**
 * Filter by Age:
 * Given a list of Person objects with name and age fields,
 * use a stream to filter and print all people older than 30.
 */
public class FilterByAge {
    public static void main(String[] args) {
        List<Person> list = List.of(new Person("Jane", 15), new Person("John", 31),
                new Person("Alice", 30), new Person("Alex", 43), new Person("Peterson", 38));
        list.stream()
                .filter(person -> person.getAge() > 30)
                .sorted(Comparator.comparingInt(Person::getAge))
                .forEach(System.out::println);
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return MessageFormat.format("name={0}, age={1}", name, age);
    }
}

