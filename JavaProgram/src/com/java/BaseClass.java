// Method Overriding

package com.java;

public class BaseClass {
	public void method() {
		System.out.println("I'm method of Baseclass");
	}
}
class DerivedClass extends BaseClass{
	public void method() {
		System.out.println("I'm in method of DerivedClass");
	}
}
class override{
	public static void main(String[] args) {
		DerivedClass der = new DerivedClass();
		der.method();
		
		BaseClass base = new BaseClass();
		base.method();
		
		BaseClass base1 = new DerivedClass();
		base1.method();
	}
}
