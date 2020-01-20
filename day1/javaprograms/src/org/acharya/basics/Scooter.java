package org.acharya.basics;

public class Scooter extends Vehicle{

	public Scooter(String model, String make, double price) {
		super(model, make, price);
		// TODO Auto-generated constructor stub
	}
	
	public void start() {
		System.out.println("Button Start ");
	}
	
	public void accelerate() {
		System.out.println("accelerate ");
		this.speed = this.speed + 10;
	}

}
