package com.joe.SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.joe.AnotherExample.Car;
import com.joe.AnotherExample.Doors;
import com.joe.AnotherExample.Engine;
import com.joe.AnotherExample.Tires;

@Configuration
public class AppConfig {
	
	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}
	
	@Bean
	public MobileProcessor getProcessor() {
		// we will return process from the instance of object Snapdragon, because class Snapdragon implement
		// interfaces MobileProcessor
		return new Snapdragon();
	}
	
	// manual add bean on class that wanna inject the object
	@Bean
	public Car newCar() {
		Engine e = new Engine();
		Doors d = new Doors();
		Tires t = new Tires();
		
		return new Car(e,d,t);
	}
	
}
