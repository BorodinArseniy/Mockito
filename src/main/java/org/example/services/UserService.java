package org.example.services;


import org.example.User;
import org.example.repositries.UserRepository;
import org.example.repositries.UserRepositoryImpl;


public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean checkUserExists(User user){

        return userRepository.getUserByName(user.getName()) !=null;
    }
}
