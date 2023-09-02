package Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpSystem {
	
	static ArrayList<empdetails> employee = new ArrayList<>();
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		EmpSystem es = new EmpSystem();
		es.addEmp();
		
		while(true) {
			System.out.println();
			System.out.println(".....Employee Management System.....");
			System.out.println("1. Add Employee ");
			System.out.println("2. Employee Details ");
			System.out.println("3. Search Employee ");
			System.out.println("4. Exit");
			
			System.out.print("Enter your choice: ");
			String option = sc.next();
			
			switch(option) {
			
			case "1":
				es.emp();
				break;
				
			case "2":
				es.empDetails();
				break; 
				
			case "3":
				es.search_emp();
				break;
				
			case "4" :
                System.out.println("Exiting...");
                sc.close();
                System.exit(0);
				
			default:
				System.out.println("Invalid Option. Please select another option");
			}
		}
	}

		void emp(){
		
		System.out.println("Enter Employee Name : ");
		sc.nextLine();
		String empname = sc.nextLine();
		
		while(!isValidName(empname)) {
			System.out.println("Invalid Name!!...Enter valid Name again");
			empname = sc.nextLine();
			
		}
		
		System.out.println("Enter Employee ID : ");
		int empid = sc.nextInt();
		
		while(!isUniqueId(empid)) {
			System.out.println("ID must be unique and Valid...!");
    		empid = sc.nextInt();
		}
		System.out.println("Enter Employee Age : ");
		int empage =sc.nextInt();
		
		System.out.println("Enter Employee Email : ");
		sc.nextLine();
		String email = sc.nextLine();
		
		System.out.println("Enter Employee Address : ");
		String address = sc.nextLine();
		
		System.out.println("Enter Employee Department : ");
		String department = sc.nextLine();
		
		System.out.println("Enter Employee salary : ");
		double salary = sc.nextDouble();
		
		System.out.println(" Employee Added...");
		
		employee.add(new empdetails(empname, empage, empid, email, address, department, salary));
		
	}

		private boolean isValidName(String empname) {
			
			if(empname == null) {
				return false;	
			}
			
			for(char c : empname.toCharArray()){
				if(!Character.isLetter(c) && c != ' '){
					return false;
				}
			}
			return true;
		}
		
		private boolean isUniqueId(int empid) {
			
			if(empid<0) {
	    		return false;
	    	}
	    	
	    	for (empdetails employee : employee) {
	            if (employee.getEmpid() == empid)
	            	return false;
	    	}
	    	
	    	return true;
			
		}

		ArrayList<empdetails> addEmp() {
	
		empdetails e1 = new empdetails("Ramesh", 28, 12, "Ramesh12@gmail.com", "Rau", "Lead", 35000);
		empdetails e2 = new empdetails("kamal", 32, 101, "kamal912@gmail.com", "Goa", "Dev", 44000);
		empdetails e3 = new empdetails("sai", 24, 72, "sai902@gmail.com", "Rajastan", "HR", 30000);
		
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		
		return employee;
		
		}

		void empDetails() {
			
			if(!employee.isEmpty()) {
				
	    		System.out.println("Employee Details:");
				for(empdetails emp : employee) {
					System.out.println(emp);
				}
			}
			else {
				System.out.println(" Employee Details Not Available. ");
			}
		}
	
		
		void search_emp() {
		
		System.out.println("Enter employee id to search : ");
		int id = sc.nextInt();
		
		boolean flag = false;
		
		for(empdetails emp : employee) {
			
			if(emp.getEmpid() == id) {
				System.out.println("Employee with ID "+id+" found : " + emp);
				flag = true;
				break;
		    }
		}
		if(!flag) {
			System.out.println("Employee with ID "+ id + " not found.");
		}
		
	}

}
