package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");


        // retrieve bean from spring container
        Coach theCoach=context.getBean("myCoach",Coach.class);

        Coach myCoach=context.getBean("oneMoreCoach",Coach.class);



        // call methods on the bean
        System.out.println(theCoach.getDaylyWorkout());
        System.out.println(myCoach.getDaylyWorkout());

        // close the context
        context.close();

    }

}
