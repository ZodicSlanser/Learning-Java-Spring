package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O4_pre_post_destroy;

import org.springframework.stereotype.Component;

@Component
public class SomeOtherIndependentService implements ManagedComponentInterface {
    SomeOtherIndependentService(){
        System.out.println("other independent service initializing");
    }


    @Override
    public void initialization() {
        System.out.println("other independent service constructed");
    }

    @Override
    public void cleanup() {
        System.out.println("other independent service destroyed");

    }
}

