package com.wipro.datetime;

import java.time.LocalDate;
import java.time.Period;

public class DateDifferenceFixed {
    public static void main(String[] args) {
 
        LocalDate date1 = LocalDate.of(2024, 12, 25);
        LocalDate date2 = LocalDate.of(2025, 1, 6); 

        if (date1.isAfter(date2)) {
            LocalDate temp = date1;
            date1 = date2;
            date2 = temp;
        }

        Period difference = Period.between(date1, date2);

        System.out.println("Difference: " + difference.getYears() + " years, " +
                           difference.getMonths() + " months, " +
                           difference.getDays() + " days");
    }
}
