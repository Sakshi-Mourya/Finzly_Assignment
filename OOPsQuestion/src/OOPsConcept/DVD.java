package OOPsConcept;

public class DVD extends LibraryItem{
	
	private int duration;

	public DVD(String title, int itemID, int duration) {
		super(title, itemID);
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void displayInfo() {
		System.out.println("The Total Duration of DVD "+getDuration());
		System.out.println("Duration is  "+ duration + "\nItemID is "+super.getItemID()+  "\nTitle is "+ super.getTitle()+"\n");
	}

}
