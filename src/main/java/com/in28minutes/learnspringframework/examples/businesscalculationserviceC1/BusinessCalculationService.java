package com.in28minutes.learnspringframework.examples.businesscalculationserviceC1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class BusinessCalculationService {

    private DataService dataService;

    @Autowired // can be stated or not stated, will work both ways
    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;

    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

}
