package Com.Wipro.Payment;

public class Paytm implements PaymentGateway {

	public void pay(double amount) {
		System.out.println("✅ Paid ₹" + amount + " using Paytm.");
	}
}
