package com.wipro.datetime;

import java.time.LocalDate;

public class LeapYearCheck {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 2, 29); 
        int year = date.getYear();

        if (date.isLeapYear()) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }
}
