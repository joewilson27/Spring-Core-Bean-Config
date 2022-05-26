package com.joe.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.joe.AnotherExample.Car;
import com.joe.AnotherExample.Doors;
import com.joe.AnotherExample.Engine;
import com.joe.AnotherExample.Tires;

public class Samsung {
	
	@Autowired // maka nanti annotation autowired ini akan mencari bean pada AppConfig dengan method yg type return MobileProcessor
	MobileProcessor cpu; // MobileProcessor is interfaces, but in AppConfig, we return object Snapdragon because Snapdragon implement
	// interface MobileProcessor, so Snapdragon == MobileProcessor
	
	// sample from udemy, inject object Car, put @Bean to type Car in AppConfig
	@Autowired
	Car car; // Car is class
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		
		System.out.println("Octa Core, 4 gb Ram, 12MP camera");
		// this method will call the process() method which is a part of an interface MobileProcessor
		cpu.process();
		
		// get default method name() from instance of tir class (tires object)
		car.tir.name();
	}
	
//	// manual add bean on class that wanna inject the object
//	@Bean
//	public Car newCar() {
//		Engine e = new Engine();
//		Doors d = new Doors();
//		Tires t = new Tires();
//		
//		return new Car(e,d,t);
//	}
	
}
