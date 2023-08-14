package task;

public class Vowels {
	public static void main(String[] args) {
		String str="Encapsulation";
		int[]arr = new int[5];
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == 'A' || str.charAt(i) == 'a')
				arr[0] = 1;
			
			else if(str.charAt(i) == 'E' || str.charAt(i) == 'e')
				arr[1] = 1;
			
			else if(str.charAt(i) == 'I' || str.charAt(i) == 'i')
				arr[2] = 1;
			
			else if(str.charAt(i) == 'O' || str.charAt(i) == 'o')
				arr[3] = 1;
			
			else if(str.charAt(i) == 'U' || str.charAt(i) == 'u')
				arr[4] = 1;
			
		}
		boolean bool = true;
		for(int i=0; i<5; i++) {
			if(arr[i] == 0) {
				bool = false;
			}
		}
		if(!bool)
			System.out.println("All Vowels are not Present");
		else
			System.out.println("All Vowels are Present");
			
	}

}
