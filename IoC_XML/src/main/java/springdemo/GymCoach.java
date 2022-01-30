package springdemo;

public class GymCoach implements Coach {

    @Override
    public String getDaylyWorkout() {

        return "Lift 100 kilos 100 times";
    }

}
