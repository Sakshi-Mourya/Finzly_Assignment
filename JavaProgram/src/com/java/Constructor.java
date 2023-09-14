package com.java;

public class Constructor {
	
	public Constructor() {// default 
		System.out.println("Constructor Running");
	}
	
	public Constructor(int a) {// Parameterized
		System.out.println("Constructor Running " + a);
	}
	
	public static void main(String[] args) {
		Constructor cd = new Constructor();
		
		//calling parameterized Constructor
		Constructor cd1 = new Constructor(5);
	}
}
