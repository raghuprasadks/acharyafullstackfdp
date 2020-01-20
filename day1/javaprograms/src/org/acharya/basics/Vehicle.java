package org.acharya.basics;

public class Vehicle {
	String model;
	String make;
	double price;
	
	public Vehicle(String model,String make,double price)
	{
		this.model = model;
		this.make = make;
		this.price = price;
	}
	
	public void start() {
		System.out.println("Pedal Start ");
	}

}
