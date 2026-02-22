package service;

public class FedEx implements IDelivery{
	public String delivered(double amount) {
		return "Order purchased through FedEx and amount paid is " + amount;
	}
}
