package Inheritance_employee;

import java.util.Scanner;

public class Employee_Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Manager Class.........");
		
		System.out.println("Enter Manager ID : ");
		int id  = sc.nextInt();
		System.out.println("Enter Manager Name : ");
		String name = sc.next();
		System.out.println("Enter Department : ");
		String department = sc.next();
		
		
		Manager m1 = new Manager(id, name, department);
		System.out.println("Manager ID : "+m1.getId());
		System.out.println("Manager Name : "+m1.getName());
		System.out.println("Manager Department : "+m1.getDepartment());
		
		System.out.println( "\n");
		System.out.println("Developer Class.........");
		
		System.out.println("Enter Developer ID : ");
		int id1 = sc.nextInt();
		System.out.println("Enter Developer Name : ");
		String name1 = sc.next();
		System.out.println("Enter programmingLanguage : ");
		String programmingLanguage = sc.next();
		
		Developer d1 = new Developer(id1, name1, programmingLanguage);
		System.out.println("Developer ID : "+d1.getId());
		System.out.println("Developer Name : "+d1.getName());
		System.out.println("Developer Programming Language : "+d1.getProgrammingLanguage());
		
		
	}

}
