package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O4_pre_post_destroy;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class SomeDependency {

    public void getReady() {
        System.out.println("Some logic using SomeDependency");
    }

    @PostConstruct
    public void initialization(){
        System.out.println("Dependency Constructed");
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("Dependency Being Destroyed");
    }

}
