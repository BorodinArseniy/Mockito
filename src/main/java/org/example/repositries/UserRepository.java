package org.example.repositries;

import org.example.User;

import java.util.List;

public interface UserRepository {


    User getUserByName(String name);

    List<User> findAllUsers();
}
