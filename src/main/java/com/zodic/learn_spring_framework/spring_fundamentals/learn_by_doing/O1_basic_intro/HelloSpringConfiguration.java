package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O1_basic_intro;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloSpringConfiguration {
    @Bean
    public String greet() {
        return "Hello, Spring!";
    }

    @Bean
    public String name() {
        return "Adam";
    }

    @Bean
    public int age() {
        return 19;
    }

    @Bean
    public Address address() {
        return new Address(1123, "Sub St", "Boot Lane", "CL", 11190);
    }


    @Bean
    public String greetPerson() {
        String name = "Zodic";
        return "Welcome, " + name;
    }

    @Bean(name = "hardPersonInfo")
    @Qualifier("PersonInfo")
    public Person person() {
        return new Person("Zodic", 25,
                new Address(1234, "Main St", "Springfield", "IL", 62701));
    }

    @Bean(name = "calledPersonInfo")
    @Qualifier("PersonInfo")
    public Person createdPerson() {
        return new Person(name(), age(), address());
    }

    @Bean(name = "passedPersonInfo")
    @Qualifier("PersonInfo")
    public Person passedPerson(String name, int age, Address address) {
        name = name.concat("passed");
        age++;
        return new Person(name, age, address);
    }

    @Bean
    public String farewell() {
        return "Goodbye, Spring!";
    }

}
