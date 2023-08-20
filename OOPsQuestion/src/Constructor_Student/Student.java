package Constructor_Student;

public class Student {

	private String name;
	private int age;
	private int studentId;
	
	private static int nextStudentId = 1;

	
	Student(){
		this.name = "Unknown";
		this.age = 0;
		this.studentId = nextStudentId++;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.studentId = nextStudentId;
	}
	
	public Student(String name, int age, int studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getStudentId() {
		return studentId;
	}

}
