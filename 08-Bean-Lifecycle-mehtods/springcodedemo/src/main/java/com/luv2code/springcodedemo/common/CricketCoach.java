package com.luv2code.springcodedemo.common;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //marks the class as spring bean
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constructor :"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes daily !!!";
    }
}

//We can not provide @Primary annotation to the more than one class the code will break


