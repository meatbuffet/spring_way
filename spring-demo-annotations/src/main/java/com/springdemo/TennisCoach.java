package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {



    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    //define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">> TennisCoach: inside if doMyStartupStuff()");
    }

    //define my destroy method

    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff");
    }

/*
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
*/

    public TennisCoach() {
        System.out.println("TennisCoach: inside default constructor");
    }


    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
