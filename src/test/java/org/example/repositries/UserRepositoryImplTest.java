package org.example.repositries;

import org.example.User;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class UserRepositoryImplTest {

    private final UserRepository userRepository = new UserRepositoryImpl();

    @Test
    public void getUserByNameCheck() {
        User user = userRepository.getUserByName("user1");

        Assert.assertEquals(user.name,"user1");

    }

    @Test
    public void shouldReturnNull(){
        Assertions.assertNull(userRepository.getUserByName("not existing user"));
    }


}