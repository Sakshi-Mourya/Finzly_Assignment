//Generate the Series... 0 1 1 2 3 5 8 13 21.
package ForLoop;

public class Series8 {
	public static void main(String[] args) {
		int a=0, b=1, ans=0;
		
		for(int i=0; i<10; i++) {
			ans=a+b;
			System.out.print(a+" ");
			a=b;
			b=ans;
		}
	}

}
