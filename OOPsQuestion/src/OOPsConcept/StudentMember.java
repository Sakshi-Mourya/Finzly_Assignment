package OOPsConcept;

public class StudentMember extends LibraryMember{

	public StudentMember(int memberID, String name) {
		super(memberID, name);
		
	}

	public void borrowItem(LibraryItem item) {
		
	    System.out.println("MemberID is = "+this.getMemberID()+"\nMember Name= "+ this.getName()+"\n");
	    System.out.println("Item Title = "+item.getTitle() +"\nItemId = "+ item.getItemID()+"\n");
	   
	}

}
