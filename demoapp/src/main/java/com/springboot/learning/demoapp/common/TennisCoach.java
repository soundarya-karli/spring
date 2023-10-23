package com.springboot.learning.demoapp.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
      return "Practice tennis for 1 hr";
    }
    
}
