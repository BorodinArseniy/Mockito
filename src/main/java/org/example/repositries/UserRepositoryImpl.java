package org.example.repositries;

import org.example.User;

import java.util.ArrayList;
import java.util.List;


public class UserRepositoryImpl implements UserRepository{

    private final List<User> users;


    public UserRepositoryImpl() {
        this.users = new ArrayList<>();
        this.users.add(new User("user1"));
        this.users.add(new User("user2"));
        this.users.add(new User("user3"));

    }

    @Override
    public User getUserByName(String name) {

        for(User user : users) {
            if (user.getName().equals(name)){
                return user;
            }
        }

        return null;

    }


    @Override
    public List<User> findAllUsers() {
        return users;
    }

}
