package springdemo;

public class GymCoach implements Coach{

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }



    @Override
    public String getDaylyWorkout() {
        return "lift this 100kg barbell";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
