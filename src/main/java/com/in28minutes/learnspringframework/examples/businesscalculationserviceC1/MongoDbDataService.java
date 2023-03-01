package com.in28minutes.learnspringframework.examples.businesscalculationserviceC1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Configuration
@Repository
@Primary
public class MongoDbDataService implements DataService {

    @Bean
    @Override
    public int[] retrieveData() {
        return new int[]{11, 22, 33, 44, 55};
    }

}
