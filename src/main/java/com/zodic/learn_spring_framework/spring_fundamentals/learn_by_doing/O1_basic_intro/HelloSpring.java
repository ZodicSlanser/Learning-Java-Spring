package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O1_basic_intro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class HelloSpring {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(HelloSpringConfiguration.class)
        ) {
            System.out.println(context.getBean("greet"));
            System.out.println(context.getBean("greetPerson"));
            System.out.println(context.getBean("hardPersonInfo"));
            System.out.println(context.getBean("calledPersonInfo"));
            System.out.println(context.getBean("passedPersonInfo"));
            System.out.println(context.getBean("farewell"));
            System.out.println("\n----------------~~~~~~~~~~~~~----------------\n");
            System.out.println("Beans count: " + context.getBeanDefinitionCount());
            System.out.println("Beans in the context: ");
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println("\n----------------~~~~~~~~~~~~~----------------\n");
            System.out.println("Beans of Qualifier PersonInfo: ");
            Arrays.stream(context.getBeanNamesForAnnotation(org.springframework.beans.factory.annotation.Qualifier.class))
                    .filter(name -> context.findAnnotationOnBean(name, org.springframework.beans.factory.annotation.Qualifier.class).value().equals("PersonInfo"))
                    .forEach(System.out::println);
            System.out.println("\n----------------~~~~~~~~~~~~~----------------\n");

        }
    }
}
