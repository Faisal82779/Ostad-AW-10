package assignment1;

public class CheckingAccount extends BankAccount{
	    private static final double FEE = 35.0;
	    private static final double LIMIT = 6000.0;//This limit for minimum value for fee. if 
	    
	@Override
	public void withdraw(double withdrawAmount) {
		
		double new_withdrawAmount = withdrawAmount + FEE;
		
		if (withdrawAmount > 0) {
            if (withdrawAmount <= balance && withdrawAmount <= LIMIT) {
                balance =balance - withdrawAmount;
                System.out.println("Withdrew: " + withdrawAmount);
            } else if(new_withdrawAmount - balance <= LIMIT) {
                balance = balance - new_withdrawAmount;
                System.out.println("Withdrew: " + new_withdrawAmount + " with an overdraft fee of " + FEE);
            } else {
            	System.out.println("Insufficient amount!!!");
    			System.out.println("Please try again...");
            }
		}
	}
}
