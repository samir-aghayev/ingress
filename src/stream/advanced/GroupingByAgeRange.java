package stream.advanced;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Grouping by Age Range:
 * Given a list of Person objects with name and age fields,
 * group them by age ranges (e.g., <20, 20-30, 30-40) using Collectors.partitioningBy or custom logic.
 */
public class GroupingByAgeRange {
    public static void main(String[] args) {
        List<Person> list = List.of(new Person("Jane", 15), new Person("John", 31),
                new Person("Alice", 30), new Person("Alex", 43), new Person("Peterson", 38));
        Map<String, List<Person>> collect = list.stream()
                .collect(Collectors.groupingBy(person -> {
                    if (person.getAge() < 20) {
                        return "<20";
                    }else if(person.getAge()<=30){
                        return "20-30";
                    } else if (person.getAge()<=40) {
                        return "30-40";
                    }else{
                        return ">40";
                    }
                }));

        System.out.println(collect);

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
