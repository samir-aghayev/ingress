package arrayListTasks;

import java.util.*;

public class ArrayListTasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    public static void task1() {
        List<Integer> integerList = new ArrayList<>();
        fillList(integerList);
        integerList.remove(3);
        int secondElement = integerList.get(2);
        System.out.println(secondElement);
    }


    public static void task2() {
        int[] arr = new int[5];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int number = new Random().nextInt(100);
            arr[i] = number;
            list.add(number);
        }
        System.out.println("array length: " + arr.length);
        System.out.println("list length: " + list.size());

    }


    public static void task3() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Pear");
        stringList.add("Orange");
        stringList.add("Grape");
        stringList.add("Peach");
        System.out.println(stringList);
        System.out.println("stringList.contains(\"Apple\"): " + stringList.contains("Apple"));
        System.out.println("stringList.indexOf(\"Grape\"): " + stringList.indexOf("Grape"));
        System.out.println("stringList.set(2, \"Cherry\")");
        stringList.set(2, "Cherry");
        System.out.println(stringList);
        System.out.println("stringList.isEmpty()): " + stringList.isEmpty());
        System.out.println("stringList.clear()");
        stringList.clear();
        System.out.println(stringList);
    }


    public static void task4() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Pear");
        stringList.add("Orange");
        stringList.add("Grape");
        stringList.add("Peach");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(stringList.get(i) + " ");
        }
        System.out.println();
        for (String s : stringList) {
            System.out.print(s + " ");
        }
        System.out.println();
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    public static void task5() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Namiq", 15));
        personList.add(new Person("Kamal", 19));
        personList.add(new Person("Tural", 25));
        personList.add(new Person("Murad", 36));
        personList.add(new Person("Emil", 49));
        personList.add(new Person("Nicat", 84));
        personList.add(new Person("Anar", 6));
        System.out.println(personList);
        Collections.sort(personList);
        System.out.println(personList);
    }

    public static void task6() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Namiq", 15));
        personList.add(new Person("Kamal", 19));
        personList.add(new Person("Tural", 25));
        personList.add(new Person("Murad", 36));
        personList.add(new Person("Emil", 49));
        personList.add(new Person("Nicat", 84));
        personList.add(new Person("Anar", 6));
        System.out.println(personList);
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(personList);
    }

    public static void task7() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("War and Peace", "Leo Tolstoy"));
        bookList.add(new Book("1984", "George Orwell"));
        bookList.add(new Book("Crime and Punishment", "Fyodor Dostoevsky"));
        bookList.add(new Book("Pride and Prejudice", "Jane Austen"));
        bookList.add(new Book("One Hundred Years of Solitude", "Gabriel Garcia Márquez"));
        Iterator<Book> bookIterator = bookList.iterator();
        while (bookIterator.hasNext()) {
            System.out.println(bookIterator.next());
        }
    }

    public static void task8() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(15);
        integerList.add(20);
        integerList.add(5);
        integerList.add(20);
        integerList.add(15);
        System.out.println(integerList);
        Set<Integer> integerSet = new HashSet<>(integerList);
        System.out.println(integerSet);
    }

    public static void task9() {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        lists.add(new ArrayList<>());
        lists.add(new ArrayList<>());
        for (List<Integer> list : lists) {
            fillList(list);
        }
        for (List<Integer> list : lists) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    private static void fillList(List<Integer> integerList) {
        for (int i = 0; i < 5; i++) {
            int number = new Random().nextInt(100);
            integerList.add(number);
        }
    }


}
