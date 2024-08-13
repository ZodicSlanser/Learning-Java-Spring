package com.zodic.learn_spring_framework.spring_fundamentals.iterations_example.O4_iteration_four;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("superContraGame")
public class SuperContraGame implements Controllable {
    public void up() {
        System.out.println("SuperContra jumped up");
    }

    public void down() {
        System.out.println("SuperContra ducked down");
    }

    public void left() {
        System.out.println("SuperContra moved left");
    }

    public void right() {
        System.out.println("SuperContra shot a bullet");
    }
}
