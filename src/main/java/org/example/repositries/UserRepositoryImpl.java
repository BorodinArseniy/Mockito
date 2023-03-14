package org.example.repositries;

import org.example.User;

import java.util.ArrayList;


public class UserRepositoryImpl {

    public static ArrayList<User> users = new ArrayList<>();

    public UserRepositoryImpl() {
        users.add(new User("user1"));
        users.add(new User("user2"));
        users.add(new User("user3"));

    }

    public static User getUserByName(String name) {

        return users.stream().
                filter(user -> user.name == name).
                findFirst().orElse(null);

    }


    public static ArrayList<User> findAllUsers() {
        return users;
    }



}
