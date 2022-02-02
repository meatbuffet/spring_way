package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        // load spring config file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        TennisCoach theCoach=context.getBean("tennisCoach",TennisCoach.class);
        TennisCoach alphaCoach=context.getBean("tennisCoach",TennisCoach.class);
        BurgerCoach myCoach=context.getBean("burgerCoach",BurgerCoach.class);
        ;

        //check if they are the same
        boolean result=(theCoach==alphaCoach);

        //print out the results
        System.out.println("Pointing to the same object: "+result);

        System.out.println("Memory location for theCoach: "+theCoach);

        System.out.println("Memory location for alphaCoach: "+alphaCoach);

        System.out.println(myCoach.getDailyFortune());

        context.close();
    }
}
