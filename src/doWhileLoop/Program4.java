//Write a Program To print 1 to 100 even nos.
package doWhileLoop;

public class Program4 {
	public static void main(String[] args) {
		int i=1;
		 do{
			if((i%2)==0) {
				System.out.println(i);
			}
			i++;
		 }while(i<=100);
			
	}
}
