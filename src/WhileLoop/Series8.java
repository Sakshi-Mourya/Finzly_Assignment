//Generate the Series... 0 1 1 2 3 5 8 13 21.
package WhileLoop;

public class Series8 {
	public static void main(String[] args) {
		int a=0, b=1, ans=0, i=0;
		while(i<10) {
			ans=a+b;
			System.out.print(a+" ");
			a=b;
			b=ans;
			
			i++;
		}
	}

}
