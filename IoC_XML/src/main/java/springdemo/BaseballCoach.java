package springdemo;

public class BaseballCoach implements Coach{

    @Override
    public String getDaylyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
}
