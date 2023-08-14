//Write a Program To print even and odd No
package ForLoop;

import java.util.Scanner;

public class Ten {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int N = sc.nextInt();
		
		System.out.println("Even No.");
		for(int i=1; i<=N; i++) {
			
			if((i%2)==0)
				System.out.println(i);
		}
		
		System.out.println("Odd No.");
		
		for(int i=1; i<=N; i++) {
				
			if((i%2) != 0)
				System.out.println(i);
				
		}
	}
}
