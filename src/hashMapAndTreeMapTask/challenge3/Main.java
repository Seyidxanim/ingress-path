package hashMapAndTreeMapTask.challenge3;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Nuray", "+(90)123");
        phoneBook.addPhoneNumberToSpecificContact("Nuray", "+(90)99999");
        phoneBook.addContact("Ali", "+(90)456");
        phoneBook.addPhoneNumberToSpecificContact("Ali", "+(90)789");
        phoneBook.addContact("Murad", "+(90)321");
        phoneBook.addPhoneNumberToSpecificContact("Murad", "+(90)324");

        phoneBook.printAllContacts();

    }
}
