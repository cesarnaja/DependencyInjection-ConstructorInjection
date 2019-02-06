package com.luv2code.springdemo;

public class TennisCoach implements Coach{
	
	private FortuneService fortuneService; 
	
	public TennisCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService; 
	}

	@Override
	public String getDailyWorkout() {
		
		return "Hit 50 back-hand shots and 50 front-hand shots";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	
	
}
