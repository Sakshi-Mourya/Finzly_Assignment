//Example of Method Overriding
package task;

class Baseclass{
	public void method() {
		System.out.println("I'm the method of BaseClass");
	}
}

class DerivedClass extends Baseclass{
	public void method() {
		System.out.println("I'm the method of Derived Class");
	}
}
public class Override {

	public static void main(String[] args) {
		//method calling from sub class object
		DerivedClass der = new DerivedClass();
		der.method();
		
		//method calling from super class object
		Baseclass base = new Baseclass();
		base.method();
		
		Baseclass base1 = new DerivedClass();
		base1.method();
		
	}
}
