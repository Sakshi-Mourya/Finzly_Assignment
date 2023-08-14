//Write a Program To print even and odd No
package doWhileLoop;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int N = sc.nextInt();
		
		System.out.println("Even No.");
		int i=1;
		 do{
			
			if((i%2)==0)
				System.out.println(i);
			i++;
		}while(i<=N);
		
		System.out.println("Odd No.");
		 do{
			
			if((i%2)!=0)
				System.out.println(i);
			i++;
		}while(i<=N);
	}
}
