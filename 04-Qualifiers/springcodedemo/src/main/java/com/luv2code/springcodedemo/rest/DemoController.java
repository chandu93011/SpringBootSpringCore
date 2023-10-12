package com.luv2code.springcodedemo.rest;

import com.luv2code.springcodedemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field fot the dependency
    private Coach myCoach;

    //In the spring we use @Qualifer annotation to identify which class we are using as shown below.
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach){
        myCoach=coach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
