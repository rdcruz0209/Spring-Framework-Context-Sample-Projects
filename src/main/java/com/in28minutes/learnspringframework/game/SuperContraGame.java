package com.in28minutes.learnspringframework.game;

public class SuperContraGame implements GamingConsole {

    public void up() {
        System.out.println("Super Contra: up");

    }

    public void down() {
        System.out.println("Super Contra: Sit down");
    }

    public void left() {
        System.out.println("Super Contra: Go Back");

    }

    public void right() {
        System.out.println("Super Contra: Shoot a bullet");

    }

    @Override
    public String toString() {
        return SuperContraGame.class.toString();
    }
}
