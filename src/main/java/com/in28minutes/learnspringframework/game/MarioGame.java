package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("MarioGame: Jump");
    }

    public void down() {
        System.out.println("MarioGame: Go into hole");
    }

    public void left() {
        System.out.println("MarioGame: Go Back");
    }

    public void right() {
        System.out.println("MarioGame: Accelerate");
    }

    @Override
    public String toString() {
        return MarioGame.class.toString();
    }
}
