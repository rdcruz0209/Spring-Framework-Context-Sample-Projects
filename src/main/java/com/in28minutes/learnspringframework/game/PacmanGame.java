package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacmanGame implements GamingConsole {

    public void up() {
        System.out.println("Pacman Game: Going up and eating upwards");
    }

    public void down() {
        System.out.println("Pacman Game: Going down and eating downwards");
    }

    public void left() {
        System.out.println("Pacman Game: Going left and eating left");
    }

    public void right() {
        System.out.println("Pacman Game: Going right and eating right");
    }


}
