package com.zodic.learn_spring_framework.spring_fundamentals.iterations_example.O1_iteration_one;

public class GameRunner {
    MarioGame game;

    public GameRunner(MarioGame marioGame) {
        this.game = marioGame;
    }

    public void run() {
        System.out.println("running game:" + game);
        game.up();
        game.down();
        game.left();
        game.right();

    }
}
