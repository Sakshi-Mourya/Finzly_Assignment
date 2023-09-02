package School;

public class stud_details {

	private String stname;
	private int stage;
	private int stid;
	
	
	public stud_details(){
		super();
		
	}

	public stud_details (String stname, int stage, int stid) {
		super();
		this.stname = stname;
		this.stage = stage;
		this.stid = stid;	
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public int getStage() {
		return stage;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	@Override
	public String toString() {
		return "stud_details [stname=" + stname + ", stage=" + stage + ", stid=" + stid + "]";
	}
	
	
}
