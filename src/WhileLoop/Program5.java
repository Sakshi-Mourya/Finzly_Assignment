//Write a Program To print sum of 1 to 50 Odd nos.
package WhileLoop;

public class Program5 {
	public static void main(String[] args) {
		int i=1, sum=0;
		while(i<=50) {
			if((i%2)!=0) {
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);
	}

}
