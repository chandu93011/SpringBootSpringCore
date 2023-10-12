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
    private Coach anotherCoach;
    //In the spring we use @Qualifer annotation to identify which class we are using as shown below.
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach,
                          @Qualifier("cricketCoach") Coach theAnotherCoach){
        System.out.println("In constructor :"+getClass().getSimpleName());
        myCoach=coach;
        anotherCoach=theAnotherCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans: myCoach == anotherCoach -->"+ (myCoach ==anotherCoach);
        //checking to the see the bean if  : it will entirely depend on the scope if it will be the singleton then it will return True for Prototype it will return false
    }
}
