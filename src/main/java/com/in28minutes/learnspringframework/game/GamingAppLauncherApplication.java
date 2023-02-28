package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
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
