package com.springboot.learning.demoapp.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Goal atleast 5 balls";
    }
}
