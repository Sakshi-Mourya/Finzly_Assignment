package FinalEx;

public class DemoBlankVariable {

		// Blank final variable
		final int MAX_VALUE;
		DemoBlankVariable() {
		// It must be initialized in constructor
		MAX_VALUE = 100;
		}
		
		void myMethod() {
		System.out.println(MAX_VALUE);
		}
		
		public static void main(String args[]) {
		DemoBlankVariable obj = new DemoBlankVariable();
		obj.myMethod();
		}
}
