package homework.v1;

import java.util.HashMap;

public class Phonebook {
    private HashMap<String, String> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        phonebook.put(name, phoneNumber);
    }

    public String getPhoneNumber(String name) {
        return phonebook.get(name);
    }

    public void removeContact(String name) {
        phonebook.remove(name);
    }

    public void printAllContacts() {
        for (String name : phonebook.keySet()) {
            System.out.println(name + " " + phonebook.get(name));

        }
    }

}
