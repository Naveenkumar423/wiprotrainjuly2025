package com.wipro.oops;

public class HDFC implements BankOps {
    private double balance = 5000.0;
    public void deposit(double amount, String accNumber) {
        System.out.println("HDFC: Depositing ₹" + amount + " into account " + accNumber);
        balance += amount;
    }
    public double withdraw(double amount, String accNumber) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("HDFC: Withdrawn ₹" + amount + " from account " + accNumber);
        } else {
            System.out.println("HDFC: Insufficient funds in account " + accNumber);
        }
        return balance;
    }
}
