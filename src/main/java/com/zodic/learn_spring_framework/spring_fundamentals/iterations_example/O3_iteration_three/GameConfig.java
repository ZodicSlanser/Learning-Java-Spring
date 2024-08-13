package com.zodic.learn_spring_framework.spring_fundamentals.iterations_example.O3_iteration_three;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {

    @Bean(name = "pacmanGame")
    @Qualifier("Game")
    public Controllable pacmanGame() {
        return new PacmanGame();
    }

    @Bean(name = "marioGame")
    @Qualifier("Game")
    public Controllable marioGame() {
        return new MarioGame();
    }

    @Bean(name = "superContraGame")
    @Qualifier("Game")
    public Controllable superContraGame() {
        return new SuperContraGame();
    }

    @Bean(name = "pacmanGameRunner")
    @Qualifier("GameRunner")
    public GameRunner pacmanGameRunner() {
        return new GameRunner(pacmanGame());
    }

    @Bean(name = "marioGameRunner")
    @Qualifier("GameRunner")
    public GameRunner marioGameRunner() {
        return new GameRunner(marioGame());
    }

    @Bean(name = "superContraGameRunner")
    @Qualifier("GameRunner")
    public GameRunner superContraGameRunner() {
        return new GameRunner(superContraGame());
    }

}
