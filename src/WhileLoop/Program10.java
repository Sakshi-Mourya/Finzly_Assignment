//Write a Program To print even and odd No
package WhileLoop;

import java.util.Scanner;

public class Program10 {
	public class Ten {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			
			int N = sc.nextInt();
			
			System.out.println("Even No.");
			int i=1;
			while(i<=N) {
				
				if((i%2)==0)
					System.out.println(i);
				i++;
			}
			
			System.out.println("Odd No.");
			
			while(i<=N) {
				
				if((i%2)!=0)
					System.out.println(i);
				i++;
			}
		}
	}
}
