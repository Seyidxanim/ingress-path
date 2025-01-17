package loginRegisterSystem.dao.repository;

import loginRegisterSystem.dao.model.User;

public class Main {
    public static void main(String[] args) {
        User u=new User("Lale","Abdullayeva",22,"Aze","Baki","llls",
                "hgh@7uh","7755n","+9945");
        UserRepository uR=new UserRepository();
        uR.addUser(u);
        System.out.println(uR.getAllUser());
        System.out.println(uR.findByUserName("llls"));
        System.out.println(uR.findByUserEmail("hgh@7u"));
    }
}
