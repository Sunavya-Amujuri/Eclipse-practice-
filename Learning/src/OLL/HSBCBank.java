package OLL;

public class HSBCBank {
	int accountBal;
	
	public HSBCBank(int accountBal) {       // updated
		this.accountBal = accountBal;
	}
	
	synchronized public void deposit(int deposit) {
		accountBal = accountBal + deposit;
	}
	
	synchronized public void withdrawal(int withdrawal) {
		accountBal = accountBal - withdrawal;
	}
	
	synchronized public void balanceCheck() {
		System.out.println("The balance in the account is " + accountBal);
	}
}
