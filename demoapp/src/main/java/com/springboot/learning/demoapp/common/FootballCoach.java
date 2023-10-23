package com.springboot.learning.demoapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary used when multiple implementations exists
//@Lazy used when we want to invoke the call only when a dependency injection exists for it
@Primary
@Component
@Lazy
public class FootballCoach implements Coach {
    public FootballCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Goal atleast 5 balls";
    }
}
