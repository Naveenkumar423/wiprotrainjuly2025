package com.wipro.oops;

public class Citi implements BankOps {
    private double balance = 10000.0;
    public void deposit(double amount, String accNumber) {
        System.out.println("Citi Bank: Depositing ₹" + amount + " into account " + accNumber);
        balance += amount;
    }
    public double withdraw(double amount, String accNumber) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Citi Bank: Withdrawn ₹" + amount + " from account " + accNumber);
        } else {
            System.out.println("Citi Bank: Cannot withdraw ₹" + amount + " from account " + accNumber +
                               " — Minimum balance of ₹1000 must be maintained.");
        }
        return balance;
    }
}
