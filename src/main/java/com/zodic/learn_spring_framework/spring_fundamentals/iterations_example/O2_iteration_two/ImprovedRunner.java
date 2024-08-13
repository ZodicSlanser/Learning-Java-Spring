package com.zodic.learn_spring_framework.spring_fundamentals.O2_iteration_two;

public class ImprovedRunner {

    public static void main(String[] args) {
        var superContraGame = new SuperContraGame();
        var marioGame = new MarioGame();
        var pacmanGame = new PacmanGame();
        var screenOne = new GameRunner(marioGame);
        var screenTwo = new GameRunner(superContraGame);
        var screenThree = new GameRunner(pacmanGame);
        screenOne.run();
        screenTwo.run();
        screenThree.run();

    }
}
