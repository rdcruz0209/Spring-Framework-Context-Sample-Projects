package com.in28minutes.learnspringframework.examples.businesscalculationservice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class BusinessCalculationApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                BusinessCalculationService.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(BusinessCalculationService.class).findMax());

    }

}
