package com.in28minutes.learnspringframework.examples.d1lazyinitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Lazy
class ClassA {

    public ClassA() {
        System.out.println("1) Constructing Class A");
    }
}

@Component
@Lazy
class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        //logic
        System.out.println("2) Some Initialization logic");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("Come on, Do Something");
    }
}


//@Lazy
@ComponentScan
@Configuration
public class LazyInitializationLauncherApplication {


    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (LazyInitializationLauncherApplication.class)) {

            System.out.println("Initialization of the context is completed");

            context.getBean(ClassB.class);


            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }


//        GameRunner gameRunner = new GameRunner(game);


    }

}
