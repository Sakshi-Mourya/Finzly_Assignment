// Write a Program To print sum of odd and even no.
package doWhileLoop;

import java.util.Scanner;

public class Program9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int N = sc.nextInt();
		int even=0, odd=0;
		int i=0;
		do{
			
			if((i%2) == 0)
				even=even+i;
			
			if((i%2) != 0)
				odd=odd+i;
			
			i++;
				
		}while(i<=N);
		System.out.println("sum of even no. "+even);
		System.out.println("sum of odd no. "+odd);
		
	}

}
