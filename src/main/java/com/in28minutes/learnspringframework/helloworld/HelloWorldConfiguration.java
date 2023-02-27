package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

record Person(String name, int age, Address address) {
}

record Address(String firstLine, String city) {
}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Robert";
    }

    @Bean
    public int age() {
        return 27;
    }

    @Bean
    public Person person() {
        return new Person("Claire", 21, new Address("B10 L25 Florenceville Tagapo", "Sta Rosa Laguna"));
    }

    //make a new spring bean using existing spring beans
    //Done via method call
//    @Bean
//    public Person person2MethodCall() {
//        return new Person(name(), age(), address()); //use the spring bean to create a new person spring bean
//        //the bean that will be returned is the name of the bean method name()
//    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3); //use the spring bean to create a new person spring bean
        // the bean that will be returned is the name of the Bean defined as @Bean(name= "name") or method name if name is not defined
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address); //use the spring bean to create a new person spring bean
        // the bean that will be returned is the name of the Bean defined as @Bean(name= "name") or method name if name is not defined
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
        return new Person(name, age, address); //use the spring bean to create a new person spring bean
        // the bean that will be returned is the name of the Bean defined as @Bean(name= "name") or method name if name is not defined
    }


//    @Bean(name = "address")
//    public Address address() {
//        return new Address("Address: Block 10 Lot 25 Florenceville", "Santa Rosa Laguna");
//    }

    @Bean("address2")
    @Primary
    public Address address2() {
        return new Address("Address 2: Block 10 Lot 25 Florenceville", "Santa Rosa Laguna");
    }

    @Bean("address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("Address 3: Lot 20 Amethyst Street Crismor Subd.", "San Pedro Laguna");
    }


}
