package org.ukasz.spring_demo_annotations;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	public String getDailyWorkout() {
		return "Kick the ball !";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
