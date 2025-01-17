package loginRegisterSystem.service;

import loginRegisterSystem.dao.model.User;
import loginRegisterSystem.dao.repository.UserRepository;

import java.util.Objects;
import java.util.Scanner;

public class UserService {
    private final UserRepository userRepository;
    private final String encryptionKey = "*/-=";

    private static final Scanner SCANNER = new Scanner(System.in);

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //TODO 1: rewrite!
    public void registerUser() {
        System.out.print("Enter you email: ");
       // SCANNER.next();
        String email = SCANNER.nextLine();
        if (isEmailRegistered(email)) {
            System.out.println("This email already taken!");
            return;
        }
        System.out.print("\nEnter your username: ");
        String username = SCANNER.nextLine();
        System.out.print("\nEnter you password: ");
        String password = SCANNER.nextLine();
        System.out.print("\nEnter you firstName: ");
        String firstName = SCANNER.nextLine();
        System.out.print("\nEnter you age: ");
        int age = SCANNER.nextInt();

        User user = new User(firstName, null, age, null, null, username, email, encryptPassword(password), null);
        userRepository.addUser(user);
        System.out.println("User created successfully " + (Objects.nonNull(firstName) ? firstName : ""));
    }

    //TODO 2: rewrite!
    public void login(String email, String password) {
        if (!isEmailRegistered(email)) {
            System.out.println("Invalid email! We've not an User with given email " + email);
            return;
        }
        User userByEmail = userRepository.findByUserEmail(email);
        String decryptedPassword = decryptPassword(userByEmail.getPassword());
        if (Objects.equals(password, decryptedPassword))
            System.out.println("You logged in successfully! email: " + email);
        else
            System.out.println("Entered invalid password!");
    }

    public User getUserDetails(String username) {
        return userRepository.findByUserName(username);
    }

    private String encryptPassword(String password) {
        return password + encryptionKey;
    }

    private String decryptPassword(String encryptedPassword) {
        return encryptedPassword.replace(encryptionKey, "");
    }

    //TODO 3: use this method instead of written code, change userName to email.
    private Boolean verifyUserCredentials(String userName, String email) {
        return userRepository.findByUserName(userName) != null && userRepository.findByUserEmail(email) != null;
    }

    public boolean isEmailRegistered(String email) {
        return userRepository.findByUserEmail(email) != null;
    }

}
