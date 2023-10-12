package com.luv2code.springcodedemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    public TennisCoach(){
        System.out.println("In constructor :"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice 40 minutes daily to be good in the tennis";
    }
}
