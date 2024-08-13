package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O1_basic_intro;

public record Person(String name, int age, Address address) {
    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}
