package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O2_initialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HelloLazySpring {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(HelloLazySpringConfiguration.class)
        ) {
            System.out.println(context.getBean("greet"));

            context.getBean(B.class);

            System.out.println(context.getBean("farewell"));

        }
    }
}
