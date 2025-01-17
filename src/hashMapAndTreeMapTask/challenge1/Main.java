package hashMapAndTreeMapTask.challenge1;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("John1", "+(90)123");
        phoneBook.addContact("John2", "+(90)456");
        phoneBook.addContact("John3", "+(90)789");
        phoneBook.addContact("John4", "+(90)321");
        phoneBook.addContact("John5", "+(90)654");

        String john1PhoneNumber = phoneBook.getPhoneNumber("John1");
        System.out.printf("Contact name: %s, phone number: %s\n", "John1", john1PhoneNumber);

        phoneBook.removeContact("John1");
        System.out.println("After remove operation:");
        phoneBook.printAllContacts();
    }
}
