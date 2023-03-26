package org.example.services;

import org.example.User;
import org.example.repositries.UserRepository;
import org.example.repositries.UserRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

class UserServiceTest {
    @Mock
    private UserRepository ur;
    @InjectMocks
    private UserService out;


    @Test
    void shouldReturnFalse() {

        when(ur.getUserByName("user1")).thenReturn(null);

        boolean userExists = out.checkUserExists(new User("user1"));
        Assertions.assertFalse(userExists);

    }

    @Test
    void shouldReturnTrue() {

        when(ur.getUserByName("user1")).
                thenReturn( new User("user1"));

        boolean userExists = out.checkUserExists(new User("user1"));
        Assertions.assertTrue(userExists);

    }
}