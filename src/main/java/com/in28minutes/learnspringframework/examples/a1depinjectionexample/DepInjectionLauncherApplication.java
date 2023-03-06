package com.in28minutes.learnspringframework.examples.a1depinjectionexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class Dependency1 {


}


@Component
class Dependency2 {


}


//YourBusinessClass
//Dependency1
//Dependency2
@Component
class YourBusinessClass {

    //@Autowired - Field Injection
    Dependency1 dependency1;
    //@Autowired - Field Injection
    Dependency2 dependency2;


    //    @Autowired - Constructor Injection - will work even if @Autowired is not stated


    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor Injection");
        System.out.println(dependency1);
        System.out.println(this.dependency1);
        this.dependency1 = dependency1;
        System.out.println(this.dependency1);

        System.out.println(dependency2);
        System.out.println(this.dependency2);
        this.dependency2 = dependency2;
        System.out.println(this.dependency2);

        //parameter value is autowired by the singleton of class Dependency1 and Dependency2
    }

//    @Autowired // -- setter injection - works as if parameter reference injection
//    public void setDependency(Dependency1 dependency1) {
//        System.out.println("Setter Dependency1 Injection");
//        this.dependency1 = dependency1;
//    }
//
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

            System.out.println(context.getBean(YourBusinessClass.class).toString());
        }

//        GameRunner gameRunner = new GameRunner(game);


    }

}
