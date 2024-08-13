package com.zodic.learn_spring_framework.spring_fundamentals.iterations_example.O2_iteration_two;

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
