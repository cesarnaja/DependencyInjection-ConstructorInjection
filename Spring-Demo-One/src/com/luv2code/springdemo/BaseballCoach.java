package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

	//Defining a private field for dependency
	private FortuneService fortuneService; 
	
	//Defining a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) 
	{
		this.fortuneService = fortuneService; 
	}
	
	@Override
	public String getDailyWorkout() 
	{
		return "Spend 30 mins on batting practice";
	}
	@Override
	public String getDailyFortune() {
		//Use the fortune service to get a fortune
		return fortuneService.getFortune();
	}
	
	
}
