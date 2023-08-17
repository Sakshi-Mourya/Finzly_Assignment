package Static_Instance;

public class Main {

	public static void main(String[] args) {
		
		Student st = new Student(11,"ram",30);
		st.show_Details();
		
		st.enroll(3);
		System.out.println("\nTotal Student : "+st.getTotalStudent()+"\n");
		
		
		st.drop(1);
		System.out.println("\nTotal Student : "+st.getTotalStudent()+"\n");
		//st.show_Details();
			
	}
}
