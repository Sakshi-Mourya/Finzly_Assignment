package School;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolMangement {

private static ArrayList<stud_details> student = new ArrayList<>();
private static ArrayList<Teacher_details> Teacher = new ArrayList<>();
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		SchoolMangement sm = new SchoolMangement();
		
		while(true) {
			
			System.out.println("School Management System");
           
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Remove Student");
            System.out.println("4. Remove Teacher");
            System.out.println("5. Display Student Record");
            System.out.println("6. Display Teacher Record");
            System.out.println("7. Exit");
            
            System.out.print("Enter your choice: ");
            String choice = sc.nextLine();
            
            switch(choice) {
            
            case "1" :
            	sm.addStudent();
            	break;
            	
            case "2" :
            	sm.addTeacher();
            	break;
            	
            case "3" :
            	System.out.println("Enter Student Id to remove Student : ");
            	int id =sc.nextInt();
            	sm.removeStudent(id);
            	break;
            	
            case "4":
            	System.out.println("Enter Teacher Id to remove Teacher : ");
            	int id1 =sc.nextInt();
            	sm.removeTeacher(id1);
            	break;
            	
            case "5" :
            	sm.dispayStudent();
            	break;
            	
            case "6" :
            	sm.dispayTeacher();
            	break;
            	
            case "7" :
                System.out.println("Exiting...");
                sc.close();
                System.exit(0);
                
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
            }
		}
	}

	private void addStudent() {
		
		System.out.println("Enter Student Name : ");
		String stname = sc.nextLine();
		
		System.out.println("Enter Student Age : ");
		int stage = sc.nextInt();
		
		System.out.println("Enter Student ID : ");
		int stid = sc.nextInt();
		
		student.add(new stud_details(stname, stage, stid));
		System.out.println("Student added successfully!");
		
	}

	private void addTeacher() {
		
		System.out.println("Enter Teacher Name : ");
		String Tname = sc.nextLine();
		
		System.out.println("Enter Teacher age : ");
		int Tage = sc.nextInt();
		
		System.out.println("Enter Teacher ID : ");
		int Tid = sc.nextInt();
		
		System.out.println("Enter Subject Name : ");
		String Subject = sc.nextLine();
		sc.nextLine();
		
		Teacher.add(new Teacher_details(Tname, Tage, Tid, Subject));
		System.out.println("Teacher added successfully!");
		
	}

	private void removeStudent(int id) {
		
		stud_details sd = new stud_details();
		
		if(sd.getStid() == id) {
			student.remove(id);
		}
		
	}

	private void removeTeacher(int id1) {
		Teacher_details Td = new Teacher_details();
		
		if(Td.getTid() == id1) {
			Teacher.remove(id1);
		}
		
	}

	private void dispayStudent() {
		
		if(!student.isEmpty()) {
			
    		System.out.println("Teachers Details:");
			for(stud_details stud : student) {
				System.out.println(stud);
			}
		}
		else {
			
			System.out.println("Student Information Not available...!");
		}
	}

	private void dispayTeacher() {
		
		if(!Teacher.isEmpty()) {
			
    		System.out.println("Teachers Details:");
		
		for(Teacher_details teach : Teacher) {
			System.out.println(teach);
		}
	}else {
		
		System.out.println("Teacher Information Not available...!");
	}
		
		
	}
	
}
