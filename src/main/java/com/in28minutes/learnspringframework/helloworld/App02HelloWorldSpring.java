package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        //1:  Launch a Spring Context

        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {


            //2: Configure the things that we want Spring to manage - @Configuration class
            //HelloWorldConfiguration - @Configuration
            //name - @Bean

            //3: Retrieving Beans managed by Spring

//        for (String s : context.getBeanDefinitionNames()) {
//            System.out.println("----");
//            System.out.println(s);
//
//        }
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
//        System.out.println("Person2MethodCall: " + context.getBean("person2MethodCall"));
            System.out.println("Person3Parameters: " + context.getBean("person3Parameters"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean(Address.class));
            System.out.println(context.getBean(Person.class));

//        use of @Qualifier to determine which bean should be used by the spring bean method
            System.out.println(context.getBean("person5Qualifier"));


//        list all spring beans contained in the context
//        for (String s : context.getBeanDefinitionNames()) {
//            System.out.println("----");
//            System.out.println(s);
//        }

//        alternative way of listing all spring beans contained in the context
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//        System.out.println(context.getBeanDefinitionCount());
            context.close();
        }


    }

}
