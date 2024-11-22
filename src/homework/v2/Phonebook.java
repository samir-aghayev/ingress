package homework.v2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    private HashMap<String, List<String>> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        if (!phonebook.containsKey(name)) {
            phonebook.put(name, new ArrayList<>());
        }
        List<String> names = phonebook.get(name);
        names.add(phoneNumber);
    }

    public List<String> getPhoneNumber(String name) {
        return phonebook.get(name);
    }

    public void removeContact(String name) {
        phonebook.remove(name);
    }

    public void removeNumber(String number) {
        for (String name : phonebook.keySet()) {
            if (phonebook.get(name).remove(number)) {
                break;
            }
        }
    }

    public void printAllContacts() {
        for (String name : phonebook.keySet()) {
            for (String number : phonebook.get(name)) {
                System.out.println(name + " " + number);
            }
        }
    }

}
