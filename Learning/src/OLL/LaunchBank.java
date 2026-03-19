package OLL;

public class LaunchBank {

	public static void main(String[] args) {     // updated
		HSBCBank bank1 = new HSBCBank(4000);
		
		GooglePay gp = new GooglePay(bank1);  // new Thread
		gp.setName("GooglePay");
		
		PhonePay pp = new PhonePay(bank1);   // new Thread
		pp.setName("PhonePay");
		
		ATM atm = new ATM(bank1);  // new Thread
		atm.setName("ATM");
		
		gp.start();
		pp.start();
		atm.start();

	}

}
