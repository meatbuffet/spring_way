package springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService{

    private String[] fortunes={"Good fortune","Bad fortune","Mediocre fortune"};

    @Override
    public String getFortune() {
        return fortunes[new Random().nextInt(fortunes.length)];
    }
}
