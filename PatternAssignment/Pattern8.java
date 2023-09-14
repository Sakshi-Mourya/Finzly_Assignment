package PatternAssignment;

public class Pattern8 {

	public static void main(String[] args) {
		char c='A';
		for(int i=5; i>=0; i--) {
			
			for(int j=0; j<i; j++) {
				
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}


}
