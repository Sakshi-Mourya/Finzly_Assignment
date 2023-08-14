////Generate the Series... 1  3  6  10  15  21  28  36  45.  
package doWhileLoop;

public class Serise6 {

	public static void main(String[] args) {
		int ans=0, i=1;
		 do{
			ans+=i;
			System.out.print(ans+" ");
			i++;
		}while(i<10);
		
	}

}
