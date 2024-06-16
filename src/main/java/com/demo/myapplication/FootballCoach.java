/**
 * 
 */
package com.demo.myapplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.demo.myapplication.api.Coach;

/**
 * 
 */
@Component
public class FootballCoach implements Coach {

	@Value("${coach.name}")
	private String coachName;
	
	@Value("${coach.team}")
	private String teamName;
	
	@Override
	public String dailyWorkout() {
		return "Hi "+teamName+" team, Practice Rotations for 15 mins followed by Stretches for 15 mins";
	}

}
