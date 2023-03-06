package com.in28minutes.learnspringframework.examples.c1primaryandqualifierexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Arrays;


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
