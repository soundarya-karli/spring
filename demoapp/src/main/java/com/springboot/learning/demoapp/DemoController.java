package com.springboot.learning.demoapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

//define private field for the dependency
private Coach myCoach;

//define Constructor for the dependency (using autowired annotation)
//autowired tells spring to inject a dependency
@Autowired
public DemoController(Coach theCoach){
    myCoach=theCoach;
}

@GetMapping("/dailyworkout")
public String getDailyWorkout(){
    return myCoach.getDailyWorkout();
}



}
