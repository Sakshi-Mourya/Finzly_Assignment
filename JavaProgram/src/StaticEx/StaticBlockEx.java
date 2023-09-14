package StaticEx;

public class StaticBlockEx {

	static int a;
	static int b;
	
	static {
	System.out.println("static block called");
	a = 10;
	b = 20;
	}
	
	public static void main(String args[]) {
	System.out.println("main method started");
	// while running a program static block will get called
	System.out.println("Value of a = " + a);
	System.out.println("Value of b = " + b);
	}

}
