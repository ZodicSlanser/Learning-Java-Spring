package com.zodic.learn_spring_framework.spring_fundamentals.iterations_example.O3_iteration_three;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImprovedRunner {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GameConfig.class)) {
            var screenOne = context.getBean("marioGameRunner", GameRunner.class);
            var screenTwo = context.getBean("superContraGameRunner", GameRunner.class);
            var screenThree = context.getBean("pacmanGameRunner", GameRunner.class);
            screenOne.run();
            screenTwo.run();
            screenThree.run();
        }

    }
}
