package org.acharya.basics;

public class Vehicle {
	String model;
	String make;
	double price;
	int speed;
	public Vehicle(String model,String make,double price)
	{
		this.model = model;
		this.make = make;
		this.price = price;
		this.speed = 0;
	}
	
	public void start() {
		System.out.println("Pedal Start ");
		this.speed = 0;
	}
	
	public void accelerate() {
		System.out.println("accelerate ");
		this.speed = 0;
	}
	public void stop() {
		this.speed = 0;
		System.out.println("vehicle stopped ");
	}
	
	public String info()
	{
		return "Make : "+this.make + " Model : "+this.model +" Price :" +this.price + " Speed :" +this.speed;
	}
}
