package springdemo;

public class BaseballCoach implements Coach{
    //define a private field
    private FortuneService fortuneService;

    //define a constructor for the dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }

    @Override
    public String getDaylyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        //use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
