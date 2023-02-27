package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingAppLauncherApplication.class)) {


//            context.getBean(GameRunner.class).run();
//            context.getBean("GamingConsole");
//            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();

//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

//        GameRunner gameRunner = new GameRunner(game);


    }

}
