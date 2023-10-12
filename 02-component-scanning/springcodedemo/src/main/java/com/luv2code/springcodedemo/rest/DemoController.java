package com.luv2code.springcodedemo.rest;

import com.luv2code.springcodedemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field fot the dependency
    private Coach myCoach;

    //define  constructor for dependency injection

    @Autowired  //this annotation tell the spring to inject the dependency
                  //if there is only one constructor then injection is optional
    public DemoController(Coach coach){
        myCoach=coach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
