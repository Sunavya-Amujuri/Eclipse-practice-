package OLL;

public class ATM extends Thread{
private HSBCBank bank;   // withdrawal from the ATM
	
	public ATM(HSBCBank bank) {
		this.bank = bank;
	}
	
	public void run() {
		System.out.println("WithDrawal");
		bank.withdrawal(2000);
	}
}
