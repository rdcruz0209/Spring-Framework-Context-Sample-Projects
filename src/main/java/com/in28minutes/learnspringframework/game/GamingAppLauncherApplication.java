package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class GamingAppLauncherApplication {
    private GamingConsole gamingConsole;

    GamingAppLauncherApplication(GamingConsole gamingConsole) {
        this.gamingConsole = gamingConsole;
    }

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingAppLauncherApplication.class)) {


//            context.getBean(GameRunner.class).run();
//            context.getBean("GamingConsole");
//            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
            System.out.println(context.getBean(MarioGame.class));

            System.out.println(context.getBean(GamingConsole.class));

            System.out.println("=-======================Spring Automatic");

            System.out.println(context.getBean("name"));

            System.out.println("=-======================Explicitly stated");
            
            MarioGame marioGame = new MarioGame();
            marioGame.StringName();
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

//        GameRunner gameRunner = new GameRunner(game);


    }

}
