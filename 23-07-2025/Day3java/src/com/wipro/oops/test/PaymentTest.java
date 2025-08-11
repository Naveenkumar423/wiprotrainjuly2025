package com.wipro.oops.test;

import com.wipro.oops.PaymentMethod;
import com.wipro.oops.Gpay;
import com.wipro.oops.PhonePay;

public class PaymentTest {
    public static void main(String[] args) {

        PaymentMethod payment1 = new Gpay();
        payment1.pay(500.0);

        PaymentMethod payment2 = new PhonePay();
        payment2.pay(1000.0);
    }
}
