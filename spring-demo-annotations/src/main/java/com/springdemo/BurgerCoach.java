package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BurgerCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Eat one more burger!";
    }
}
