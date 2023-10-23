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


//Option 1. define Constructor for the dependency (using autowired annotation)
//autowired tells spring to inject a dependency
@Autowired
public DemoController(@Qualifier("cricketCoach") Coach theCoach){
    System.out.println("In Constructor: "+getClass().getSimpleName());
    myCoach=theCoach;
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



}
