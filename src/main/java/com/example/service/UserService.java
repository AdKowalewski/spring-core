package com.example.service;

import com.example.exceptions.UserNotFoundException;
import com.example.repository.UserRepository;
import com.example.model.User;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ToString
//@Component // oznaczenie, że to bean
@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired //automatycznie wstrzykuje zależność, settery i gettery nie są potrzebne
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsersByFirstNameAndLastName(String firstName, String lastName) {
        return userRepository.getUsers().stream()
                .filter(user -> firstName.equals(user.getFirstName()) && lastName.equals(user.getLastName()))
                .collect(Collectors.toList());
    }

    public User getUserByLogin(String login) {
        return userRepository.getUsers().stream()
                .filter(user -> login.equals(user.getLogin().toLowerCase()))
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException(String.format("User %s not found", login)));
    }
}
