package service;

public class BlueDart implements IDelivery {
	public String delivered(double amount) {
		return "Ordered delivered to BlueDart and amount paid is "+ amount;
	}
}
