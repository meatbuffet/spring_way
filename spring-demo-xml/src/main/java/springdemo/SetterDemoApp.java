package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from spring container
        CricketCoach theCoach=context.getBean("myCricketCoach",CricketCoach.class);
        GymCoach homeCoach=context.getBean("homeworkCoach",GymCoach.class);
        System.out.println(homeCoach.getDailyFortune());
        System.out.println(homeCoach.getDaylyWorkout());

        //call method on the bean
        //later
        System.out.println(theCoach.getDaylyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //call our new methods to get the literal values

        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());
        //close context
        context.close();

    }
}
