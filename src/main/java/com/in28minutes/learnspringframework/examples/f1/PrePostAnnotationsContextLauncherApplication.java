package com.in28minutes.learnspringframework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Component
class SomeClass {
    private SomeDependencies someDependencies;


    public SomeClass(SomeDependencies someDependencies) {
        this.someDependencies = someDependencies;
        System.out.println("All dependencies are ready");
    }

    @PostConstruct
    public void initialize() {
        someDependencies.getReady();
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("Clean up");
    }
}

@Component
//@Named - Jakarta EE same as @Component
class SomeDependencies {

    public void getReady() {
        System.out.println("Some Logic using SomeDependency");
    }

}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (PrePostAnnotationsContextLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

//        GameRunner gameRunner = new GameRunner(game);


    }

}
