package org.acharya.basics;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		//int num1 = 10;
		//int num2 = 20;
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int result = cal.add(num1,num2);
		System.out.println("Result of addition of "+num1 +" and "+ num2+" is "+ result);
	}
	
	public int add(int num1,int num2) {
		int result = num1 + num2;
		return result;
	}

}
