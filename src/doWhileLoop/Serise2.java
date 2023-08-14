//Generate the Series... 9 18 27 36 45 54 63 72 81 90. 
package doWhileLoop;

public class Serise2 {
	public static void main(String[] args) {
		int i=9;
		 do{
			if(i%9==0)
				System.out.print(i+" ");
			i++;
		}while(i<=90);
			
	}

}
