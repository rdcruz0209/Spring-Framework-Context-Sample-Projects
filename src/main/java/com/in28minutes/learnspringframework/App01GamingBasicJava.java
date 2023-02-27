package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.*;

public class App01GamingBasicJava {

    public static void main(String[] args) {
//        var game = new MarioGame();

//        var game = new PacmanGame();
        var game = new SuperContraGame();

        GameRunner gameRunner = new GameRunner(game);


        gameRunner.run();


    }

}
