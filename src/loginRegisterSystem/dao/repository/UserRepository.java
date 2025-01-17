package loginRegisterSystem.dao.repository;

import loginRegisterSystem.dao.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public final List<User> userList;

    public UserRepository(){
        this.userList=new ArrayList<>();
    }

    public void addUser(User user){
        userList.add(user);
    }

    public List<User> getAllUser(){
        return userList;
    }

    public User findByUserEmail(String email){
        for (User user1:userList){
            if (user1.getEmail().equals(email)){
                return user1;
            }
        }
        return null;
    }

    public User findByUserName(String userName){
        for (User user2:userList){
            if (user2.getUsername().equals(userName)){
                return user2;
            }
        }
        return null;
    }
}
