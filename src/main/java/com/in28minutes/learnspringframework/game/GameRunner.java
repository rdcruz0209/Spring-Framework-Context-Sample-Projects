package com.in28minutes.learnspringframework.game;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;


@Controller
public class GameRunner {


    private GamingConsole game;

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
