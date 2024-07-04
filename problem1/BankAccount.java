package assignment1;

public class BankAccount {
	
	protected double balance;
	
	
	public void deposite(double amount) {
		if(amount>0) {
			balance = balance + amount;
			System.out.println("Deposited: "+ balance);
		}else {
			System.out.println("Invalide amount!!!");
			System.out.println("Please try again...");
		}
	}
	public void withdraw(double withdrawAmount) {
		
	}
	public void displaybalance() {
		System.out.println("Your new balance is : "+balance);
	}
}
