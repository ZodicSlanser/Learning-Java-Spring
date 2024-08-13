package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O1_basic_intro;

public record Address(int houseNumber, String street, String city, String state, int zipCode) {
    public Address {
        if (houseNumber < 0) {
            throw new IllegalArgumentException("House number cannot be negative");
        }
        if (zipCode < 0) {
            throw new IllegalArgumentException("Zip code cannot be negative");
        }
    }
}
