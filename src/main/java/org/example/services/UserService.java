package org.example.services;


import org.example.User;
import org.example.repositries.UserRepositoryImpl;


public class UserService {

    static UserRepositoryImpl userRepository;

    public static boolean checkUserExists(User user){
        for (User user1 : userRepository.users) {
            if(user1 == user){
                return true;
            }
        }

        return false;
    }
}
