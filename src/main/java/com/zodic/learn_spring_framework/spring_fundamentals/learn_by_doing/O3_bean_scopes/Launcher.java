package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O3_bean_scopes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Launcher {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(Launcher.class)){

            System.out.println("Tester Class Inspection Point");
            System.out.println("=================================");
            context.getBean(Tester.class).getComponents();
            context.getBean(Tester.class).getComponents();
            context.getBean(Tester.class).getComponents();
            System.out.println("=================================");


            System.out.println("Normal Classes Inspection Point");
            System.out.println("=================================");
            context.getBean(Normal.class);
            context.getBean(Normal.class);
            context.getBean(Normal.class);
            System.out.println("=================================");

            System.out.println("Prototype Classes Inspection Point");
            System.out.println("=================================");
            context.getBean(Prototype.class);
            context.getBean(Prototype.class);
            context.getBean(Prototype.class);
            System.out.println("=================================");

        }
    }
}
