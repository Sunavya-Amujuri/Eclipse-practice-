package service;

public class DTDC implements IDelivery{
	public String delivered(double amount) {
		return "Order purchased through DTDC and amount paid is " + amount;
	}
}
