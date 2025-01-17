package hashMapAndTreeMapTask.challenge3;

import java.util.*;

public class PhoneBook {
    public final Map<String, List<String>> contacts;

    public PhoneBook() {
        contacts = new TreeMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, new ArrayList<>(List.of(phoneNumber)));
    }

    public void addPhoneNumberToSpecificContact(String name, String phoneNumber) {
        if (Objects.isNull(contacts.get(name))) {
            contacts.put(name, new ArrayList<>(List.of(phoneNumber)));
        } else {
            List<String> phoneNumberList = contacts.get(name);
            phoneNumberList.add(phoneNumber);
        }
    }

    public List<String> getPhoneNumber(String name) {
        return contacts.get(name);
    }

    public void removeSpecificPhoneNumber(String name, String phoneNumber) {
        List<String> phoneNumbers = contacts.get(name);
        if (phoneNumbers != null && !contacts.isEmpty()) {
            phoneNumbers.remove(phoneNumber);
            if (phoneNumbers.isEmpty()) {
                contacts.remove(name);
            }

        }
    }

    public void removeContactEntirely(String name) {
        contacts.remove(name);


    }

    public void printAllContacts() {
        for (Map.Entry<String, List<String>> el : contacts.entrySet()) {
            System.out.printf("Contact name: %s, Phone Number: %s.%n", el.getKey(), el.getValue());
        }

//        for (String name:contacts.keySet()){
//            System.out.printf("Contact name: %s, PhoneNumber: %s, %n" , name,contacts.get(name));
//        }

    }


}
