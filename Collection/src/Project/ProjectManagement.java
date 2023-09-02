package Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProjectManagement {

	private static HashMap<String,prodetails> projects = new HashMap<>();
	static Scanner sc =   new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ProjectManagement pm = new ProjectManagement();
		
		while(true) {
			
	            System.out.println("Project Management System");
	            System.out.println("1. Add Project");
	            System.out.println("2. Assign Team Member to Project");
	            System.out.println("3. View Project Details");
	            System.out.println("4. List All Projects");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            
	            int choice = sc.nextInt();
			            sc.nextLine(); 
			            
				switch(choice) {
		        
				case 1:
		             pm.addProject();
		             break;
		         
				case 2:
					pm.assignMember();
		            break;
		
				case 3:
					pm.viewProject();
		            break;
		    
				case 4:
					pm.printProjects();
		            break;
		        
				case 5:
		             System.out.println("Exiting program.");
		             sc.close();
		             System.exit(0);
		
		         default:
		             System.out.println("Invalid choice. Please select a valid option.");
				}
		}
		
	}

	private void addProject() {
		
		System.out.print("Enter project name: ");
        String projectName = sc.nextLine();
        
        System.out.print("Enter project Information: ");
        String projectInfo = sc.nextLine();
        
        projects.put(projectName, new prodetails(projectName, projectInfo));
        System.out.println("Project added successfully.");
		
	}

	private void assignMember() {
		
		System.out.print("Enter project name: ");
        String assignProjectName = sc.nextLine();
        
        if (projects.containsKey(assignProjectName)) {
            
        	System.out.print("Enter team member name: ");
            String teamMemberName = sc.nextLine();
            
            projects.get(assignProjectName).addTeamMember(teamMemberName);
            System.out.println("Team member assigned successfully.");
        } else {
            System.out.println("Project not found.");
        }
		
	}

	private void viewProject() {
		
		System.out.print("Enter project name: ");
        String name = sc.nextLine();
        
        if (projects.containsKey(name)) {
            System.out.println("Project Details:");
            System.out.println(projects.get(name));
        } else {
            System.out.println("Project not found.");
        }
		
	}

	private void printProjects() {
		
		if(!projects.isEmpty()) {
			System.out.println("List of All Projects:");
			
            for (Map.Entry<String, prodetails> proj : projects.entrySet()) {
                System.out.println(proj.getValue());
            }
		}else {
			System.out.println("No Project Information available...!");
		}
		
	}

}
