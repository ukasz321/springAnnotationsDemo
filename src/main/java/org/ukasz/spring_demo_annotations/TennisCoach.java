package org.ukasz.spring_demo_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	public TennisCoach(){
		System.out.println(">> TennisCoach: inside default cousntructor");
	}
	
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService thFortuneService){
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff");
		fortuneService = thFortuneService;
	}
	
	@Autowired
	public TennisCoach (FortuneService thefortuneService){
		fortuneService = thefortuneService;
	}
	*/
	
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	
}
