package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O4_pre_post_destroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


@Component
public abstract class ManagedComponentClass {

    @PostConstruct
    void initialization(){

        System.out.println("Abstract Class Initialized");

    }

    @PreDestroy
    void cleanup(){

        System.out.println("Abstract Class Destroyed");
    }
}
