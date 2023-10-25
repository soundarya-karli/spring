package com.springboot.learning.demoapp.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learning.demoapp.common.Coach;

@RestController
public class DemoController {

//define private field for the dependency
private Coach myCoach;
private Coach anotherCoach;


//Option 1. define Constructor for the dependency (using autowired annotation)
//autowired tells spring to inject a dependency
@Autowired
public DemoController(
        @Qualifier("cricketCoach") Coach theCoach,
        @Qualifier("cricketCoach") Coach theanotherCoach){
    System.out.println("In Constructor: "+getClass().getSimpleName());
    myCoach=theCoach;
    anotherCoach=theanotherCoach;
}

/*
//Option 2. define setter injection
//use setCoach() or you can use any method name
//@Qualifier used to specify when multiple implementations exists
@Autowired
public void setCoach(@Qualifier("cricketCoach") Coach myCoach){
    this.myCoach=myCoach;
}
*/

@GetMapping("/dailyworkout")
public String getDailyWorkout(){
    return myCoach.getDailyWorkout();
}

//2 bean scopes(by default bean scope is singleton)-->true for singleton, false for prototype
@GetMapping("/check")
public String check(){
    return "Comparing Beans myCoach=anotherCoach: "+(myCoach==anotherCoach);
}


}
