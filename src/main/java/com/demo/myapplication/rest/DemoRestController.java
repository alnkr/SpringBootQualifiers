/**
 * 
 */
package com.demo.myapplication.rest;

import org.springframework.web.bind.annotation.RestController;

import com.demo.myapplication.api.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * Demo Rest Controller class for understanding the Constructor Injection.
 */
@RestController
public class DemoRestController {
		
	private Coach Coach;
		
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return Coach.dailyWorkout();
	}
	
	@Autowired
	public DemoRestController(@Qualifier("footballCoach")Coach coach) {
		Coach = coach;
	}
	
	
}
