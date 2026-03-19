package OLL;

public class PhonePay extends Thread{        // updated
	private HSBCBank bank;
	
	public PhonePay(HSBCBank bank) {
		this.bank = bank;
	}
	
	public void run() {
		System.out.println("Balance Check");
		bank.balanceCheck();
	}
}
