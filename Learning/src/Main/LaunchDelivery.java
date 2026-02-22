package Main;

import service.FedEx;
import service.DTDC;

public class LaunchDelivery {
	public static void main(String[] args) {
		
		Myntra m = new Myntra(new FedEx());
		
//		Myntra m1 = new Myntra();
//		m1.setDelivery(new DTDC());
		
		Myntra m1 = new Myntra(new FedEx());
		m1.setDelivery(new DTDC());
		
		String status = m1.buyTheOrder(4999.9);
		System.out.println(status);
	}

}
