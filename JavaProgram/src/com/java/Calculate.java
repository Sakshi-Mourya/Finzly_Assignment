package com.java;
// Method Overloading by changing data type of Arguments

public class Calculate {
	
	void sum(int a, int b) {
		System.out.println("sum is "+(a+b));
	}
	
	void sum(double c, double d) {
		System.out.println("Sum is "+(c+d));
	}
	public static void main(String[] args) {
		Calculate cal = new Calculate();
		cal.sum(8, 5);
		cal.sum(6.8, 9.7);
	}
}
