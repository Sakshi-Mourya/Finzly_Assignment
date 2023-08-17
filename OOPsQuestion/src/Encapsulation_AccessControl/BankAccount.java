package Encapsulation_AccessControl;

public class BankAccount {

	private String accountNumber;
	private String ownerName;
	private double balance;
	
	public BankAccount(String accountNumber, String ownerName, double balance) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void depositing(double amount) {
		balance += amount;
	}
	
	public void withdrawing(double amount) {
		balance -= amount;
	}
	
	public double showBalance() {
		return balance;	
	}
	
	public void showDetails() {
		System.out.println("The Owner Name : "+getOwnerName());
		System.out.println("The Account Number : "+getAccountNumber());
		System.out.println("The Total Balance : "+showBalance());
	}
	
}
