package com.in28minutes.learnspringframework.examples.e1scopesprototypebeanmultipleinstance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
class NormalClass {

}

@Scope(value = "prototype")
@Component
class PrototypeClass {

    NormalClass nc;

    @Autowired
    PrototypeClass(NormalClass nc) {
        this.nc = nc;
        System.out.println(this.nc);
    }

}

@Configuration
@ComponentScan

public class BeanScopesLauncherApplication {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (BeanScopesLauncherApplication.class)) {

            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));

            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));

            PrototypeClass ptc = context.getBean(PrototypeClass.class);
            System.out.println("PTC OBJECT " + ptc);
        }

//        GameRunner gameRunner = new GameRunner(game);


    }

}
