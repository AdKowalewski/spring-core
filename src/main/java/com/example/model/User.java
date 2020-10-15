package com.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class User {
    private String login;

    private String firstName;

    private String lastName;

    private String email;

    private List<UserAddress> address;

    public User(String login, String firstName, String lastName, String email, List<UserAddress> address) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    public String getLogin() {
        return login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public List<UserAddress> getAddress() {
        return address;
    }
}
