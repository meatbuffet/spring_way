package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

@Component
public class WrittenFortune implements FortuneService{

    @Value("${foo.fortune}")
    private String[] fortunes;
    @Override
    public String getFortune() {
        return fortunes[new Random().nextInt(fortunes.length)];
    }

    @PostConstruct
    private void setupMyFortunes(){
        fortunes[4]="SuperHell";
    }
}
