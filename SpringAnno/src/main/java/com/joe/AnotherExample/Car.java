package com.joe.AnotherExample;

public class Car {
	
	public Engine eng;
	public Doors doo;
	public Tires tir;
	
	public Car(Engine e, Doors d, Tires t) {
		this.eng = e;
		this.doo = d;
		this.tir = t;
	}
	
	public void printCarDetails() {
		System.out.println(this.eng + " " + this.doo);
	}
	
}
