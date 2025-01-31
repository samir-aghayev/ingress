package recordPractica;

public class PersonPrint {
    public static void main(String[] args) {
        Person person =new Person("Name1", 19);
        Person person2 =new Person("Name2", 20);
        Person person3 =new Person("Name3", 21);
        Person person4 =new Person("Name4", 22);
        Person person5 =new Person("Name5", 23);
        printPerson(person);
        printPerson(person2);
        printPerson(person3);
        printPerson(person4);
        printPerson(person5);
    }

    public static void printPerson(Person person) {
        person.print();
    }
}
