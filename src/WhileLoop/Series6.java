//Generate the Series... 1  3  6  10  15  21  28  36  45.   
package WhileLoop;

public class Series6 {
	public static void main(String[] args) {
		int ans=0, i=1;
		while(i<10) {
			ans+=i;
			System.out.print(ans+" ");
			i++;
		}
		
	}
}
