package com.springboot.learning.demoapp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    
    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 30 mins :)!!!!!!";
    }

}
