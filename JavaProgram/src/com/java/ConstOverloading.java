package com.java;

public class ConstOverloading {
	int val1;
	int val2;
	
	ConstOverloading(){
		val1 = 10;
		val2 = 20;
		System.out.println("Inside 1st Constructor");
	}
	
	ConstOverloading(int a){
		val1 = a;
		System.out.println("Inside 2nd Construtor ");
	}
	
	ConstOverloading(int a,int b){
		val1 = a;
		val2 = b;
		System.out.println("Inside 3rd Constructor");
	}
	
	public void display() {
		System.out.println("value1 = "+val1);
		System.out.println("value2 = "+val2);
	}
	public static void main(String[] args) {
		ConstOverloading d1 = new ConstOverloading();
		ConstOverloading d2 = new ConstOverloading(30);
		ConstOverloading d3 = new ConstOverloading(30,40);
		d1.display();
		d2.display();
		d3.display();
		
	}
}
