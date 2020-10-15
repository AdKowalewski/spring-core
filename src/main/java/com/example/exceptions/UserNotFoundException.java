package com.example.exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String text) {
        System.out.println(text);
    }
}
