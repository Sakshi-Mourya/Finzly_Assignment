package Final_Constructor;

public class Antivirus {

	public Antivirus() {
		System.out.println("You are using free version , PLease Upgrade");
	}
	
	public Antivirus( Transaction t1) {
		if(t1 != null) {
			System.out.println("Your Product Key is = "+t1.productKey +"\n Enjoy Your Plan...");
		}
		else {
			System.out.println("Transcation is not done - Please Pay first to activate Product Key");
		}
	}
	public static void main(String[] args) {
		
		Transaction t1 = new Transaction();
		
		Antivirus a1 = new Antivirus(t1);
	}

}

