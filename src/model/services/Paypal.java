package model.services;

public class Paypal implements OnlinePayment{
	
	private static final double feePercentage = 0.02;
	private static final double monthlyInterest = 0.01;
	
	@Override
	public double paymentFee(double amount) {
		return amount * feePercentage;
	}
	
	@Override
	public double interest(double amount, int months) {
		return amount * months * monthlyInterest;
	}
}
