package com.in28minutes.learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


//YourBusinessClass
//Dependency1
//Dependency2
@Component
class YourBusinessClass {

    //@Autowired - Field Injection
    Dependency1 dependency1;
    //@Autowired - Field Injection
    Dependency2 dependency2;


    public Dependency1 getDependency() {
        return dependency1;
    }

    //    @Autowired - Constructor Injection - will work even if @Autowired is not stated
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor Injection");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    //    @Autowired -- setter injection - works as if parameter reference injection
//    public void setDependency(Dependency1 dependency) {
//        System.out.println("Setter Dependency1 Injection");
//        this.dependency = dependency;
//    }

    public Dependency2 getDependency2() {
        return dependency2;
    }

//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("Setter Dependency2 Injection");
//        this.dependency2 = dependency2;
//    }

    @Override
    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
}

@Component
class Dependency1 {

}


@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (DepInjectionLauncherApplication.class)) {


//            context.getBean(GameRunner.class).run();
//            context.getBean("GamingConsole");


            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class));
        }

//        GameRunner gameRunner = new GameRunner(game);


    }

}
