//Write a Program To print sum of 1 to 50 EVEN nos.
package WhileLoop;

public class Program6 {
	public static void main(String[] args) {
		int i=1, sum=0;
		while(i<=50) {
			if((i%2)==0) {
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);
	}


}
