package com.luv2code.springcodedemo.common;

//we are not using the component annotation because we will use some another approach(BEAN)
public class SwimCoach implements Coach {

    public SwimCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}
