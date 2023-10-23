package com.springboot.learning.demoapp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary used when multiple implementations exists
@Primary
@Component
public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Goal atleast 5 balls";
    }
}
