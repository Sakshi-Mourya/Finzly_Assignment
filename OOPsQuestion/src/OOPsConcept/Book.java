package OOPsConcept;

public class Book extends LibraryItem {

	private String author;

	public Book(String title, int itemID, String author) {
		super(title, itemID);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	};
	
	public void displayInfo() {
	
		System.out.println("The author name is "+ author + "\nThe Item ID is "+super.getItemID()+  "\nThe Title is "+ super.getTitle()+"\n");
	
	}

}
