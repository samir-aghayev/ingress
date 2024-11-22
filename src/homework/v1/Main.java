package homework.v1;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.addContact("Rustem", "0509364784");
        phonebook.addContact("Ali", "0501111111");
        phonebook.addContact("Emil", "0505555555");
        phonebook.addContact("Nicat", "0506666666");
        phonebook.addContact("Togrul", "0507777777");

        String ali = phonebook.getPhoneNumber("Ali");
        System.out.println(ali);

        phonebook.removeContact("Emil");

        phonebook.printAllContacts();

    }
}
