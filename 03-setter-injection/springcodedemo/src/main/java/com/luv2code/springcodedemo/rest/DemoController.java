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

    @Autowired // setter injection we basically create a set method and will Auto wire it.
    // we can keep the name whatever we want but we can't keep the name as the constructor.
    public  void setCoach(Coach coach){
        myCoach=coach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}


// the most recommended injector by the spring.io team is constructor injection and setter injection is optional
// field injection is the other option but not used now a days but the earlier developer use that in significant way.

//Example of filed injection
//@Autowired
// private Coach coach; that's it we don't need to create  the constructor or setter for the injection part