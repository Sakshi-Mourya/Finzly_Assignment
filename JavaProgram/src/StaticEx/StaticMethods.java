package StaticEx;

public class StaticMethods {

	private String name;
	private static String staticStr = "STATIC-STRING";
	
	public StaticMethods(String n) {
	this.name = n;
	}
	
	public static void testStaticMethod() {
	System.out.println("Hey... I am in static method...");
	// you can call static variables here
	System.out.println(StaticMethods.staticStr);
	// you can not call instance variables here.
	}
	
	public void testObjectMethod() {
	System.out.println("Hey i am in non-static method");
	// you can also call static variables here
	System.out.println(StaticMethods.staticStr);
	// you can call instance variables here
	System.out.println("Name: " + this.name);
	}
	
	public static void main(String a[]) {
	// By using class name, you can call static method
		StaticMethods.testStaticMethod();
		StaticMethods msm = new StaticMethods("jbk-best-one");
		msm.testObjectMethod();
	}

}
