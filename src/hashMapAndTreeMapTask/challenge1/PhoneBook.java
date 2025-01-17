package hashMapAndTreeMapTask.challenge1;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public final Map<String, String> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public String getPhoneNumber(String name) {
        return contacts.get(name);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public void printAllContacts() {
//        Set<Map.Entry<String, String>> entries = contacts.entrySet();
//        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
//        iterator.hasNext(); iterator.next();
        for (Map.Entry<String, String> el : contacts.entrySet()) {
            System.out.printf("Contact name: %s, Phone Number: %s.%n", el.getKey(), el.getValue());
        }
    }


}
