package com.wipro.oops;

public class CurrencyConverter {

    public static int changeCurrency(int number) throws NumberFormatException {
        if (number == 0) {
            throw new NumberFormatException("Invalid Number");
        }
        return number * 80;
    }

    public static void main(String[] args) {
        try {
            int result = changeCurrency(0);
            System.out.println("Converted Amount: ₹" + result);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
