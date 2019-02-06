package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");				
		
		//Retrieve the bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		 
		
		//Call methods on the bean
		System.out.println("Daily Workout : " + theCoach.getDailyWorkout());
		System.out.println("Daily Fortune : " + theCoach.getDailyFortune());
		
		
		
		//Close the context 
		context.close();
	}

}
