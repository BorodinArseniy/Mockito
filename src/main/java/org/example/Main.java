package org.example;

import org.example.repositries.UserRepository;
import org.example.repositries.UserRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        UserRepository up = new UserRepositoryImpl();
        System.out.println(up.findAllUsers());
    }
}