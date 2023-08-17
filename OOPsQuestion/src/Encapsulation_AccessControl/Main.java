package Encapsulation_AccessControl;

public class Main {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("CKSYU60567","Ramesh",25000);
		
		/*System.out.println(b1.getAccountNumber());
		System.out.println(b1.getOwnerName());
		System.out.println(b1.getBalance());
		*/
		b1.showDetails();
		
		System.out.println("\nAfter setting balance...");
		b1.setBalance(35000);
		b1.showDetails();
		
		System.out.println("\nAfter depositing money...");
		b1.depositing(5000);
		b1.showDetails();
		
		System.out.println("\nAfter withdrawing money...");
		b1.withdrawing(500);
		b1.showDetails();
	}

}
