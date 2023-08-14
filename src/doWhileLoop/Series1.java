//Generate the Series... 2 4 6 8 10 12 14 16 18 20.
package doWhileLoop;

public class Series1 {
	public static void main(String[] args) {
		int i=2;
		 do{
			if(i%2==0)
				System.out.print(i+" ");
			i++;
		}while(i<=20);
			
	}

	
}
