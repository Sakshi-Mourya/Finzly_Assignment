package Bank;

public class bankdetails {

	private String name;
	private String acctype;
	private int accno;
	private static double balance;
	
	public bankdetails() {
		super();
	}

	public bankdetails(String name, String acctype, int accno, double balance) {
		super();
		this.name = name;
		this.acctype = acctype;
		this.accno = accno;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcctype() {
		return acctype;
	}

	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public static double getBalance() {
		return balance;
	}

	public static void setBalance(double balance) {
		balance = balance;
	}

	@Override
	public String toString() {
		return "bankdetails [name=" + name + ", acctype=" + acctype + ", accno=" + accno + ", balance=" + balance + "]";
	}
	
	

}
