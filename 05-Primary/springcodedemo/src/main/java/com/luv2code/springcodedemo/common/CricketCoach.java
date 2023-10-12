package com.luv2code.springcodedemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //marks the class as spring bean
@Primary
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes daily !!!";
    }
}

//We can not provide @Primary annotation to the more than one class the code will break


