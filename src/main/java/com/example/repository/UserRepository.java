package com.example.repository;

import com.example.model.User;
import com.example.model.UserAddress;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@ToString
//@Component // oznaczenie, że to bean
@Repository
public class UserRepository {
    private List<User> users;
    private User user;

    @PostConstruct
    public void init() {
        this.users = Arrays.asList(
                this.user,
                new User(
                        "BlacksmitH",
                        "Adam",
                        "Kowalewski",
                        "adkowal777@gmail.com",
                        Arrays.asList(
                                new UserAddress(
                                        "Bialystok",
                                        "Poland",
                                        "Pogodna",
                                        "12-345"),
                                new UserAddress(
                                        "Kleosin",
                                        "Poland",
                                        "rrrrssf",
                                        "00-000"
                                ))),
                new User(
                        "login",
                        "Jan",
                        "Nowak",
                        "mail@gmail.com",
                        Arrays.asList(
                                new UserAddress(
                                        "Warszawa",
                                        "Poland",
                                        "eraersr",
                                        "54-321")
                        ))
        );
    }

    public UserRepository(@Qualifier("myUser") User user) {
        this.user = user;
    }

    public List<User> getUsers() {
        return users;
    }
}
