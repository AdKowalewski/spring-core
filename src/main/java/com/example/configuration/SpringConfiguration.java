package com.example.configuration;

import com.example.model.User;
import com.example.model.UserAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration //klasa konfiguracyjna, zastępująca xml-a
@ComponentScan(basePackages = "com.example") //wyszukiwanie po komponentach w pakietach w podanej lokalizacji
public class SpringConfiguration {

    @Bean("myAddress")
    public UserAddress getUserAddress() {
        return new UserAddress("Bialystok", "Poland", "Pogodna", "12-345");
    }

    @Bean("myUser")
    public User getUser() {
        return new User("login", "Jan", "Kowalski", "email@wp.pl",
                Arrays.asList(getUserAddress()));
    }

    @Bean("myUser1")
    public User getUser1() {
        return new User("login1", "Jan", "Nowak", "emailemail@wp.pl",
                Arrays.asList(getUserAddress()));
    }
}
