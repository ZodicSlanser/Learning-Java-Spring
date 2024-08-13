package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O4_pre_post_destroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class PrePostLauncher {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(PrePostLauncher.class)){
            context.getBean(SomeClass.class);
            context.getBean(ManagedComponentClass.class);
            context.getBean(SomeOtherIndependentService.class);
        }
    }
}
