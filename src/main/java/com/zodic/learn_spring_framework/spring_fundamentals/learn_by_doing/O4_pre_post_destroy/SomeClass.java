package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O4_pre_post_destroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class SomeClass {
    private SomeDependency dependency;

    public SomeClass(SomeDependency dependency) {
        super();
       this.dependency = dependency;
        System.out.println("All dependencies are ready");
    }
    @PostConstruct
    public void initialization(){
        this.dependency.getReady();
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("  Being Destroyed");
    }


}
