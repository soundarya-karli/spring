package com.springboot.learning.demoapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
       return "Spent 30 mins in batting Practice";
    }
    
}
