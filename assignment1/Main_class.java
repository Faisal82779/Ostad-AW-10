package assignment1;

public class Main_class {

	public static void main(String[] args) {
		CheckingAccount check = new CheckingAccount();
		SavingsAccount sav = new SavingsAccount();

		System.out.println("Savings Account class");
		sav.deposite(10000);
		sav.withdraw(5000);
		sav.displaybalance();
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("Checking Account class");
		System.out.println("This part for the Lower amount from fee Limit.");
		check.deposite(25000);
		check.withdraw(500);
		check.displaybalance();
		System.out.println("");
		System.out.println("");
		
		System.out.println("This part for the same amount from fee Limit.");
		check.withdraw(6000);
		check.displaybalance();
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("This part for the upper amount from fee Limit.");
		check.withdraw(7000);
		check.displaybalance();
		System.out.println("");
		System.out.println("");
		

	}

}
