package com.java;
 class A {
	int a=10;
	int b=20;
	
	void m1() {
		System.out.println("A-m1");
	}
	
	void m2() {
		System.out.println("A-m2");
	}
}
class B extends A{
	
	int b=30;
	int c=40;
	
	void m2() {
		System.out.println("B-m2");
	}
	
	void m3() {
		System.out.println("B-m3");
	}	

public static void main(String args[]) {
	A a = new A();
	B b = new B();
	
	System.out.println(a.a);
	System.out.println(a.b);
	//System.out.println(a.c);
	a.m1();
	a.m2();
//	a.m3();
}	
}