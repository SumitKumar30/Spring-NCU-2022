package org.ncu.Spring_Annotation;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	 @Override 
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run for 5 km today!";
	}

}
