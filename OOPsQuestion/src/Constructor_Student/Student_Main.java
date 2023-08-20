package Constructor_Student;

import java.util.Scanner;

public class Student_Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		
		System.out.println("Default Constructor........");
		Student s1 = new Student();
		System.out.println("Student ID : "+s1.getStudentId());
		System.out.println("Student Name : "+s1.getName());
		System.out.println("Student Age : "+s1.getAge());
		System.out.println("\n");
		
		System.out.println("Parametrized Constructor .......");
		System.out.println("Enter Student Name : ");
		String name  = sc.nextLine();
		System.out.println("Enter Student Age : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		Student s2 = new Student(name,age);
		System.out.println("Student ID : "+s2.getStudentId());
		System.out.println("Student Name : "+s2.getName());
		System.out.println("Student Age : "+s2.getAge());
		
	}

}
