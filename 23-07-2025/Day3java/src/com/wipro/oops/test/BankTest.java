package com.wipro.oops.test;

import com.wipro.oops.BankOps;
import com.wipro.oops.HDFC;
import com.wipro.oops.Citi;

public class BankTest {
    public static void main(String[] args) {
        BankOps hdfc = new HDFC();
        BankOps citi = new Citi();

        System.out.println(" HDFC Bank Transactions");
        hdfc.deposit(2000, "HDFC123");
        double hdfcBal = hdfc.withdraw(3000, "HDFC123");
        System.out.println("HDFC Final Balance: ₹" + hdfcBal);

        System.out.println("\n Citi Bank Transactions");
        citi.deposit(1500, "CITI456");
        double citiBal = citi.withdraw(9500, "CITI456");
        System.out.println("Citi Final Balance: ₹" + citiBal);
    }
}
