package com.springboot.learning.demoapp.rest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //inject properties for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;
    
    @Value("${team.name}")
    private String teamName;

    //expose new endpoint for teaminfo
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: "+coachName+"; Team: "+teamName;
    }

    //expose "/" that will return hello world
    @GetMapping("/")
    public String print(){
        return "Hello World!";
    }

    //expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getWorkout(){
        return "Ran 5k today!";
    }

     //expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getFortune(){
        return "Today is your Lucky day.";
    }


}
