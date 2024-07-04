package assignment1;

public class SavingsAccount extends BankAccount{
	
	@Override
public void withdraw(double withdrawAmount) {
		if(withdrawAmount <= balance && withdrawAmount > 0) {
			balance = balance - withdrawAmount;
			System.out.println("Your Withdraw amount " + withdrawAmount + " is successfull!!");
			
		}else {
			System.out.println("Insufficient amount!!!");
			System.out.println("Please try again...");
		}
	}
}
