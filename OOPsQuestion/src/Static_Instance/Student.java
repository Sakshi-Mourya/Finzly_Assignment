package Static_Instance;


public class Student {

	private int studentID;
	private String name;
	private static int totalStudent;
	
	public Student (int studentID, String name, int totalStudent) {
		this.studentID = studentID;
		this.name = name;
		this.totalStudent = totalStudent;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getTotalStudent() {
		return totalStudent;
	}

	public static void setTotalStudent(int totalStudent) {
		Student.totalStudent = totalStudent;
	}
	
	public void enroll(int n) {
		System.out.println("\nTotal Enroll Student : "+n);
		totalStudent += n;
		
	}
	public void drop(int n) {
		System.out.println("Total Drop Student : "+n);
		totalStudent -=n ;
	}
	
	public void show_Details() {
		System.out.println("The Student ID : "+getStudentID());
		System.out.println("The Student Name : "+getName());
		System.out.println("The Total number of Student: "+getTotalStudent());
	}
}
