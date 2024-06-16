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
public class CricketCoach implements Coach {

	@Value("${coach.name}")
	private String coachName;
	
	@Value("${coach.team}")
	private String teamName;
	
	@Override
	public String dailyWorkout() {
		return "Hi "+teamName+" team, Practice Fast bowling for 15 mins as instructed by coach "+coachName;
	}

}
