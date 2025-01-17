package loginRegisterSystem.main;

import loginRegisterSystem.dao.model.User;
import loginRegisterSystem.dao.repository.UserRepository;
import loginRegisterSystem.service.UserService;

public class Main {
    public static void main(String[] args) {

//        User user = new User("John", "Doe", 22, "USA", "New York", "johndoe",
//                "john@gmail.com", "test123", "123-456");
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        ///System.out.println(userService.isEmailRegistered("john@gmail.com"));



        userService.registerUser();
       // userService.login("111","test");


        userService.registerUser();
        //userService.login("222","test22");

        //System.out.println(userService.getUserDetails("John"));


    }
}
