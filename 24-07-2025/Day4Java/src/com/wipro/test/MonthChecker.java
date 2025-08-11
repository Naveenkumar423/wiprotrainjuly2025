package com.wipro.test;

import com.wipro.exception.InvalidMonthException;

public class MonthChecker {

    public void checkMonth(int month) throws InvalidMonthException {
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid Month: " + month + ". Month should be between 1 and 12.");
        } else {
            System.out.println("Valid Month: " + month);
        }
    }

    public static void main(String[] args) {
        MonthChecker checker = new MonthChecker();

        try {
            checker.checkMonth(0);
        } catch (InvalidMonthException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
