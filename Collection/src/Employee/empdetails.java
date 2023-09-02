package Employee;

public class empdetails {

	public empdetails() {
	}
	private String empname;
	private int empage;
	private int empid;
	private String email;
	private String address;
	private String department;
	private double salary;
	
	public empdetails(String empname, int empage, int empid, String email, String address, String department,
			double salary) {
		super();
		this.empname = empname;
		this.empage = empage;
		this.empid = empid;
		this.email = email;
		this.address = address;
		this.department = department;
		this.salary = salary;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpage() {
		return empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "employe [empname=" + empname + ", empage=" + empage + ", empid=" + empid + ", email=" + email
				+ ", address=" + address + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
	
	

}
