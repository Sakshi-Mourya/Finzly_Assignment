package Hospital;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HospitalManagement {

	private static HashMap<Integer,patients> patient = new HashMap<>();
	
	static Scanner sc =  new Scanner(System.in);
	
	public static void main(String[] args) {
		
		HospitalManagement hm = new HospitalManagement();
		
		while(true) {
			
			System.out.println("Hosiptal Management System");
            System.out.println("1. Add Patients");
            System.out.println("2. Search Patient");
            System.out.println("3. List of all Patients");
            System.out.println("4. Exit");
            
            System.out.print("Enter your choice: ");
            String choice = sc.nextLine();
            
            switch(choice) {
            
            case "1" :
            	hm.AddPatients();
            	break;
            	
            case "2" :
            	System.out.println("Enter Name of Patients to Search: ");
            	String name = sc.nextLine();
            	hm.Search(name);
            	break;
            	
            case "3" :
            	hm.List();
            	break;
            	
            case "4" :
                System.out.println("Exiting...");
                sc.close();
                System.exit(0);
                
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
            }
		}

		
	}
	private boolean isUnique(int id) {
    	
    	if(id<0) {
    		return false;
    	}
    	
    	if(patient.containsKey(id)) {
    		return false;
    	}
    	return true;
}

	private void AddPatients() {
		
		System.out.print("Enter PatientID: ");
		int id = sc.nextInt();
		
        while(true) {
        	if(!isUnique(id)) {
        		
        		System.out.println("PatientID must be unique and Valid...!");
        		id = sc.nextInt();
        	}else {
        		
        		break;
        	}
        	
        }
		
		System.out.println("Enter Patients Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Patients Age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter Patients Gender : ");
		String gender = sc.nextLine();
		
		patient.put(id, new patients(name,age,gender));
	     System.out.println("Patient added successfully!");
		
	}

	private void Search(String name) {
		
		patients p = new patients();
		
		if(p.getName() == name) {
			    		
			System.out.println(patient);
		}else {
    		System.out.println("Patient not found.");
    	}
		
	}

	private void List() {
		
		if(!patient.isEmpty()) {
			System.out.println("Patient Details:");
			
			for (Map.Entry<Integer, patients> patients : patient.entrySet()) {
	        
				System.out.println(patients.getKey()+":"+patients.getValue());
			}
		}else {
    		
    		System.out.println("Patient Information Not available...!");
    	}
		
		
	}

}
