////Generate the Series... 9 18 27 36 45 54 63 72 81 90. 
package WhileLoop;

public class Series2 {
	public static void main(String[] args) {
		int i=9;
		while(i<=90) {
			if(i%9==0)
				System.out.print(i+" ");
			i++;
		}
			
	}

}
