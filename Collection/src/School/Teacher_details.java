package School;

public class Teacher_details{

	private String Tname;
	private int Tage;
	private int Tid;
	private String Subject;
	
	public Teacher_details() {
		super();
	}
		

	public Teacher_details(String Tname, int Tage, int Tid, String Subject) {
		this.Tname = Tname;
		this.Tage = Tage;
		this.Tid = Tid;
		this.Subject = Subject;
		
	}
	public int getTid() {
		return Tid;
	}

	public void setTid(int tid) {
		Tid = tid;
	}

	public String getTname() {
		return Tname;
	}

	public void setTname(String tname) {
		Tname = tname;
	}

	public int getTage() {
		return Tage;
	}

	public void setTage(int tage) {
		Tage = tage;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}
	
	@Override
	public String toString() {
		return "Teacher_details [Tname=" + Tname + ", Tage=" + Tage + ", Tid=" + Tid + ", Subject=" + Subject + "]";
	}
}
