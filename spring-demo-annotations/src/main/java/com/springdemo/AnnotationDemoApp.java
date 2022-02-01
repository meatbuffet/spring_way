package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //get the bean from spring container
        Coach theCoach=context.getBean("tennisCoach",Coach.class);
        Coach myCoach=context.getBean("burgerCoach",Coach.class);
        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyWorkout());
        context.close();
        //close the context
    }
}
