package hashMapAndTreeMapTask.challenge2;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("John1", "+(90)123");
        phoneBook.addPhoneNumberToSpecificContact("John1", "+(90)99999");
        phoneBook.addContact("John2", "+(90)456");
        phoneBook.addPhoneNumberToSpecificContact("John2", "+(90)789");

       phoneBook.printAllContacts();
        System.out.println("----------");
        phoneBook.removeSpecificPhoneNumber("John1", "+(90)123");
        phoneBook.printAllContacts();
        System.out.println("----");
        phoneBook.removeContactEntirely("John1");
        phoneBook.printAllContacts();
    }
}
