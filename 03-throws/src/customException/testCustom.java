package customException;

//import throwsDemo.throwDemo;

public class testCustom {

	public static void main(String[] args) {
		testCustom obj = new testCustom();
		
		try {
			int withDrawAmount = 5000;
			System.out.println("Withdrawing: " + withDrawAmount);
			obj.withdrawFromATM(withDrawAmount, 4538);
			System.out.println("Amount Withdrawn");
		} 
		
		//catching custom exception
		catch (noFundException ex) {
			System.out.println("Exception Occurred. " + ex.getMessage());
		}
	}
	
	void withdrawFromATM(int withDrawAmount, int accountNumber) {
		int balance = getBalanceFromAccount(accountNumber);
		if (withDrawAmount > balance) {
			//throwing custom exception
			throw new noFundException("Insufficient funds!!!");
		}
	}
	
	int getBalanceFromAccount(int accountNumber) {
		return 1000;
	}

	
}
