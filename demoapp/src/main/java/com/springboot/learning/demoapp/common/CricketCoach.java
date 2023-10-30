package com.springboot.learning.demoapp.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)   //Prototype scope:New object instance for each injection unlike Singleton scope
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 30 mins :)!!!!!!";
    }

    //Bean Lifecycle:define init methd
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff() "+getClass().getSimpleName());
    }

    //Bean Lifecycle:define destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff() "+getClass().getSimpleName());
    }
 
}
