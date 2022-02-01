package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BurgerCoach implements Coach{

    @Autowired
    @Qualifier("writtenFortune")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Eat one more burger!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
