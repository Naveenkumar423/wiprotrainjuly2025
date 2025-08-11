package Com.Wipro.Test;

import Com.Wipro.Payment.*;

public class InversionTest {
	public static void main(String[] args) {

		PaymentGateway gpay = new GooglePay();
		PaymentGateway phonePay = new PhonePay();
		PaymentGateway paytm = new Paytm();

		PaymentProcessor processor1 = new PaymentProcessor(gpay);
		processor1.makePayment(500.0);

		PaymentProcessor processor2 = new PaymentProcessor(phonePay);
		processor2.makePayment(750.0);

		PaymentProcessor processor3 = new PaymentProcessor(paytm);
		processor3.makePayment(1000.0);
	}
}
