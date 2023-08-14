//Write a Program To print count of even No 1 to 25 no.
package doWhileLoop;

public class Program14 {

	public static void main(String[] args) {
		int i=1,count=0;
		
		do{
			if((i%2)==0)
				count++;
			i++;
		}while(i<=25);
		System.out.println(count);
	}
}
