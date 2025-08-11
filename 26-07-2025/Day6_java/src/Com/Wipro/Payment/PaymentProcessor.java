package Com.Wipro.Payment;

public class PaymentProcessor {
	private PaymentGateway gateway;

	public PaymentProcessor(PaymentGateway gateway) {
		this.gateway = gateway;
	}

	public void makePayment(double amount) {
		gateway.pay(amount);
	}
}
