package com.in28minutes.learnspringframework.game;


import org.springframework.stereotype.Component;


@Component

public class GameRunner {

    private GamingConsole game;


/*            tightly coupled
    private MarioGame marioGame;

    public GameRunner(MarioGame marioGame) {
        this.marioGame = marioGame;
    }*/

    public GameRunner(GamingConsole game) {

        this.game = game;
    }

    public void run() {
        System.out.println("\nRunning game " + game);
        game.up();
        game.down();
        game.left();
        game.right();

    }


}
