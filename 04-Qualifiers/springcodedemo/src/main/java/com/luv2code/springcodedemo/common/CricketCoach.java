package com.luv2code.springcodedemo.common;

import org.springframework.stereotype.Component;

@Component //marks the class as spring bean
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes daily !!!";
    }
}


//by using the @Primary annotation we can identify which should we run if there is nothing  is provided in this case we don't need
// to provide the @Qualifier annotation in the DemoController

// Question: if there is @Primary and @Qualifier annotation which class the program will run
// so the answer is @Qualifier annotation priority will be more we will se in the next lecture in detail.
