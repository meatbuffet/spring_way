package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {

        //load spring config file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach =context.getBean("myCoach",Coach.class);

        System.out.println(theCoach.getDaylyWorkout());

        Coach myCoach=context.getBean("homeworkCoach",Coach.class);

        Coach myCoach2=context.getBean("homeworkCoach",Coach.class);

        System.out.println(myCoach==myCoach2);
        System.out.println(myCoach);
        System.out.println(myCoach2);

        // close the context
        context.close();
    }
}
