package com.wipro.basic;

enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
    JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

public class Exe17 {
    public static void main(String[] args) {
        for (Month m : Month.values()) {
            System.out.println(m);
        }
        Month month = Month.FEBRUARY;
        if (month == Month.FEBRUARY) {
            System.out.println("The month is FEBRUARY.");
        } else {
            System.out.println("The month is not FEBRUARY.");
        }
    }
}
