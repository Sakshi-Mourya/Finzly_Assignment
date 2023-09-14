package StaticEx;
 
class Student {
	int a; // initialized to zero
	// initialized to zero only when class is loaded not for each object created.
	
	static int b;
	
	Student() {
	// Constructor incrementing static variable b
	b++;
	}
	
	public void showData() {
	System.out.println("Value of a = " + a);
	System.out.println("Value of b = " + b);
	}
}

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.showData();
		Student s2 = new Student();
		s2.showData();
		// Student.b++;
		// s1.showData();
		}


}
