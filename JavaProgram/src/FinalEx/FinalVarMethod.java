package FinalEx;

public class FinalVarMethod {

	final int a = 10;
	
	final void JBK() {
	 int i = 0;
	for (i = 0; i < 5; i++) {
	// compile time error final variable's value can'tbe change
	System.out.println("value of I+" + i);
	}
	}
	public static void main(String[] args) {
	FinalVarMethod finalEx = new FinalVarMethod();
	finalEx.JBK();
	
	}
}
