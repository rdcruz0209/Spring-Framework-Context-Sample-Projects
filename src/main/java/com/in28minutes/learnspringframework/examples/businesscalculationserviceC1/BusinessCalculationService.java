package com.in28minutes.learnspringframework.examples.businesscalculationserviceC1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Configuration
@Service
public class BusinessCalculationService {

    private DataService dataService;

    @Autowired // can be stated or not stated, will work both ways
    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    @Bean
    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

}
