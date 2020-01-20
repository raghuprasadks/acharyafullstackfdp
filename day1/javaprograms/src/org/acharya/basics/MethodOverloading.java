package org.acharya.basics;
/**
 * Method Overloading
 * @author Thinkpad
 *
 */
public class MethodOverloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading mo = new MethodOverloading();
		int res = mo.add(100, 1000);
		System.out.println("Result of int addition "+res);
		float resf = mo.add(100.0f, 200.30f);
		System.out.println("Result of float addition "+resf);
	}
	public int add(int num1,int num2)
	{
		return num1+ num2;
	}

	public float add(float num1, float num2)
	{
		return num1+num2;
	}
}
