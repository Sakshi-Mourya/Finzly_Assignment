package Inheritance_employee;

public class Developer extends Employee{
	
	private String programmingLanguage;

	public Developer(int id, String name, String programmingLanguage) {
		super(id, name);
		this.programmingLanguage = programmingLanguage;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	

	
}
