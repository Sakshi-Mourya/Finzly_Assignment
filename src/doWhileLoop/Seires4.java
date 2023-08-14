//Generate the Series... 5 10 15 20 25 30 35 40 45 50.
package doWhileLoop;

public class Seires4 {

	public static void main(String[] args) {
		int i=5;
		 do{
			if(i%5==0)
				System.out.print(i+" ");
			i++;
		}while(i<=50);
			
	}


}
