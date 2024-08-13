package com.zodic.learn_spring_framework.spring_fundamentals.iterations_example.O1_iteration_one;

public class BasicJavaRunner {

    public static void main(String[] args) {
        var superContraGame = new SuperContraGame();
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
