package com.zodic.learn_spring_framework.spring_fundamentals.O5_iteration_four;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.zodic.learn_spring_framework.O5_iteration_four")
public class GameLauncher {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GameLauncher.class)) {
            context.getBean(GameRunner.class).run();
        }

    }
}
