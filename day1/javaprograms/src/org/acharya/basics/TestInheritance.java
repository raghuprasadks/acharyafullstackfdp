package org.acharya.basics;

public class TestInheritance {

	public static void main(String[] args) {
		Scooter sct = new Scooter("Pleasure","Hero",60000);
		sct.start();
		sct.accelerate();
		String information = sct.info();
		System.out.println("Information "+information);
		sct.accelerate();
		sct.stop();

	}

}
