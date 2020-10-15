package com.example;

import com.example.configuration.SpringConfiguration;
import com.example.model.User;
import com.example.model.UserAddress;
import com.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

    public static void main(String args[]) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        UserService userService = context.getBean("userService", UserService.class);
//        System.out.println(userService.getUsersByFirstNameAndLastName("Jan", "Kowalski"));
//        System.out.println(userService.getUserByLogin("xdxd"));
        System.out.println(context.getBean("myAddress", UserAddress.class));
        System.out.println(context.getBean("myUser", User.class));
    }
}
