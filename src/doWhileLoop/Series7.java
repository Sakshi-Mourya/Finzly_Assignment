////Generate the Series... 8 16 24 32 40 48 56 64 72 80.
package doWhileLoop;

public class Series7 {

	public static void main(String[] args) {
		int i=8;
		 do{
			if(i%8==0)
				System.out.print(i+" ");
			i++;
		}while(i<=80);
			
	}

}
