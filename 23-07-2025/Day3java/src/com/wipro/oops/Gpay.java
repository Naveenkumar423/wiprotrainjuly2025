package com.wipro.oops;

public class Gpay implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made using GPay.");
    }
}
