package com.zodic.learn_spring_framework.spring_fundamentals.iterations_example.O2_iteration_two;

public class GameRunner {
    Controllable game;

    public GameRunner(Controllable game) {
        this.game = game;
    }

    public void run() {
        System.out.println("running game:" + game);
        game.up();
        game.down();
        game.left();
        game.right();

    }
}
