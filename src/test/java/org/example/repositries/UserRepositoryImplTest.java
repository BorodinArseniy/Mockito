package org.example.repositries;

import org.example.User;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.example.repositries.UserRepositoryImpl;

import static org.example.repositries.UserRepositoryImpl.getUserByName;
import static org.example.repositries.UserRepositoryImpl.users;

class UserRepositoryImplTest {

    @Test
    void getUserByNameCheck() {
        User user = new User("User");
        users.add(user);

        Assert.assertEquals(user.name,"User");


    }

    @Test
    void shouldReturnNull(){
        Assertions.assertNull(getUserByName("not existing user"));
    }




}