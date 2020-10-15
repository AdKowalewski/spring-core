package com.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserAddress {
    private String city;

    private String country;

    private String street;

    private String zipCode;

    public UserAddress(String city, String country, String street, String zipCode) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.zipCode = zipCode;
    }
}
