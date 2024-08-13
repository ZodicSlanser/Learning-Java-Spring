package com.zodic.learn_spring_framework.spring_fundamentals.O5_iteration_four;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GameRunner {
    Controllable game;

    public GameRunner(@Qualifier("marioGame") Controllable game) {
        this.game = game;
        System.out.println("GameRunner constructor called with" + game);
    }

    public void run() {
        System.out.println("running game:" + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
