package com.springboot.learning.demoapp.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose "/" that will return hello world
    @GetMapping("/")
    public String print(){
        return "Hello World!";
    }

}
