package com.in28minutes.learnspringframework.examples.businesscalculationserviceC1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@ComponentScan
@Configuration
public class RealWorldSpringContextLauncherApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                RealWorldSpringContextLauncherApplication.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        System.out.println(context.getBean("findMax"));
        int[] array = context.getBean(MongoDbDataService.class).retrieveData();
        System.out.println(array[1]);
    }

}
