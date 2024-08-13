package com.zodic.learn_spring_framework.spring_fundamentals.O5_iteration_four;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pacmanGame")
public class PacmanGame implements Controllable {
    public void up() {
        System.out.println("Pacman moved up");
    }

    public void down() {
        System.out.println("Pacman moved down");
    }

    public void left() {
        System.out.println("Pacman moved left");
    }

    public void right() {
        System.out.println("Pacman moved right");
    }
}
