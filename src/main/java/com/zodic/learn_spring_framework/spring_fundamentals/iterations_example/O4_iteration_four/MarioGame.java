package com.zodic.learn_spring_framework.spring_fundamentals.O5_iteration_four;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("marioGame")
public class MarioGame implements Controllable {

    public void up() {
        System.out.println("Mario jumped up");
    }

    public void down() {
        System.out.println("Mario ducked down");
    }

    public void left() {
        System.out.println("Mario moved left");
    }

    public void right() {
        System.out.println("Mario moved right");
    }
}
