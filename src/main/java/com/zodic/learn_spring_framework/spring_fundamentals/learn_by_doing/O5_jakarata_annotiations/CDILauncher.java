package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O5_jakarata_annotiations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class CDILauncher {
    public static void main(String[] args) {
        try(var context =  new AnnotationConfigApplicationContext(CDILauncher.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            context.getBean(BusinessService.class).printBean(context.getBean(DataService.class));
        }

    }
}
