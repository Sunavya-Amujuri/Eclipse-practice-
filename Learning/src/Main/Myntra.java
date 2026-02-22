package Main;

import service.IDelivery;

public class Myntra {
	private IDelivery delivery;
	
	public Myntra(IDelivery delivery) {
		this.delivery = delivery;
	}
	
	public Myntra() {
	}
	
	public void setDelivery(IDelivery delivery) {
		this.delivery = delivery;
	}
	
	public String buyTheOrder(double amount) {
		return delivery.delivered(amount);
	}
}
