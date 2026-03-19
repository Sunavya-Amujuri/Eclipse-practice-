package OLL;

public class ATM extends Thread{
private HSBCBank bank;
	
	public ATM(HSBCBank bank) {
		this.bank = bank;
	}
	
	public void run() {
		System.out.println("WithDrawal");
		bank.withdrawal(2000);
	}
}
