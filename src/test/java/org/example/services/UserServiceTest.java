package org.example.services;

import org.example.User;
import org.example.repositries.UserRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.stubbing.Answer;

import static org.example.repositries.UserRepositoryImpl.getUserByName;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import static org.example.repositries.UserRepositoryImpl.users;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    @Mock
    private UserRepositoryImpl userRepository;
    @InjectMocks
    private UserService out;


    @Test
    void shouldReturnFalse() {



        User user = null;



        Assertions.assertFalse(out.checkUserExists(user));



    }

    @Test
    void shouldReturnTrue() {


        User user = new User("user");

        when(userRepository.users.contains(user)).thenReturn(true);


        users.add(user);
        Assertions.assertTrue(out.checkUserExists(user));

    }
}