package com.luv2code.springcodedemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy //since we are not injecting TrackCoach So it will not be initialized
//so it will not work until it is not called manually
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In constructor :"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k daily";
    }
}
// we can also initialize the @Lazy annotation as a global configuration in the application .properties file by giving the statement
//spring.main.lazy-initialization=true