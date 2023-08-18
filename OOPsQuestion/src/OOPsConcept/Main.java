package OOPsConcept;

public class Main {
	
	public static void main(String[] args) {
		
		Book b1 = new Book("Java ", 456, "James");
		b1.displayInfo();
		
		DVD d1 = new DVD ("programming", 67, 2);
		d1.displayInfo();
		
		StudentMember s1 = new StudentMember(101,"sam");
		s1.borrowItem(b1);
		
		FacultyMember f1 = new FacultyMember(61,"riya");
		f1.borrowItem(d1);
		
	}
	
}
