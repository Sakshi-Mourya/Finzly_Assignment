package Bank;

import java.util.ArrayList;
import java.util.Scanner;

import Employee.empdetails;

public class BankingSystem {
	
	private static ArrayList<bankdetails> accounts = new ArrayList<>();
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		BankingSystem bs = new BankingSystem();
		
		while(true) {
			System.out.println();
			System.out.println("....Bank Management System.....");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. WithDrawal Money");
            System.out.println("4. Check Balance");
            System.out.println("5. List of all Accounts");
            System.out.println("6. Exit");
            
            System.out.print("Enter your choice: ");
            String choice = sc.nextLine();
            
            switch(choice) {
            
            case "1" :
            	bs.CreateAccount();
            	break;
            	
            case "2" :
            	System.out.println("Enter Amount : ");
            	double amount = sc.nextDouble();
            	bs.Deposite(amount);
            	break;
            	
            case "3" :
            	System.out.println("Enter Amount : ");
            	double amount1 = sc.nextDouble();
            	bs.Withdraw(amount1);
            	break;
            	
            case "4":
            	System.out.println("Enter Account Number to Checks Balance : ");
            	int accno = sc.nextInt();
            	bs.CheckBal(accno);
            	break;
            	
            case "5" :
            	bs.printList();
            	break;
            	
            case "6" :
                System.out.println("Exiting...");
                sc.close();
                System.exit(0);
                
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
            }
		}
	}

	private void CreateAccount() {
		
		System.out.println("Enter Customer Name : ");
		String name = sc.nextLine();
		while(!isValidName(name)) {
			System.out.println("Invalid Name!!...Enter valid Name again");
			name = sc.nextLine();
			
		}
		
		System.out.println("Enter Account Type : ");
		String acctype = sc.nextLine();
		
		
		System.out.println("Enter Account Number : ");
		int accno = sc.nextInt();
		while(!isUniqueAcc(accno)) {
			System.out.println("ID must be unique and Valid...!");
			accno = sc.nextInt();
		}
		
		System.out.println("Enter Balance : ");
		double balance = sc.nextDouble();
		while(!checkBalance(balance)) {
			System.out.println("Invalid!!!.. Balance should be greater than zero & Valid.");
			balance = sc.nextDouble();
		}
		
		
		accounts.add(new bankdetails(name, acctype, accno, balance));
		
		System.out.println(" Account Created Successfully...");
		
	}

	private boolean isValidName(String name) {
		
		if(name == null) {
			return false;	
		}
		
		for(char c : name.toCharArray()){
			if(!Character.isLetter(c) && c != ' '){
				return false;
			}
		}
		return true;
	}
	
	private boolean isUniqueAcc(int accno) {
		if(accno<0) {
    		return false;
    	}
    	
    	for (bankdetails account : accounts) {
            if (account.getAccno() == accno)
            	return false;
    	}
    	
    	return true;
	}

	private boolean checkBalance(double balance) {
		
		if(balance<0){
			return false;
		}
		else if(balance==0){
			return false;	
		}
		else{
			return true;
		}
	}

	private void Deposite(double amount) {
		
		double balance = bankdetails.getBalance();
		balance = balance+amount;
		
		//bankdetails.setBalance(bankdetails.getBalance()+amount);
		
		System.out.println("Deposit Amount : "+amount+
				"\nBalance: "+bankdetails.getBalance());
		
	}

	private void Withdraw(double amount1) {
		
		double balance = bankdetails.getBalance();
		balance = balance-amount1;
		
		//bankdetails.setBalance(bankdetails.getBalance()-amount1);
		
		System.out.println("Withdrawal Amount : "+amount1+
				"\nBalance: "+bankdetails.getBalance());
		
	}

	private void CheckBal(int accno) {
		
		boolean flag = false;
		
		for(bankdetails bd : accounts) {
			
			if(bd.getAccno() == accno) {
				System.out.println("The ToTal Balance is : " +bd.getBalance());
				flag = true;
				break;
		    }
		}
		if(!flag) {
			System.out.println("Customer with "+ accno + " not found.");
		}
		
	}

	private void printList() {
		
		if(!accounts.isEmpty()) {
			
    		System.out.println("Account Details:");
       
    		for (bankdetails account : accounts) {
            
    			System.out.println(account);
    		}
    	}else {
    		
    		System.out.println("Account Information not available...!");
    	}
		
	}

	

}
