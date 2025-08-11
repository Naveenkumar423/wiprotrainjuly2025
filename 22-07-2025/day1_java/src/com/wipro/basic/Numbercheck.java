package com.wipro.basic;

import java.util.Scanner; 

public class Numbercheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        float number = scanner.nextFloat();

        System.out.println("Input value: " + number);

        if (number == 0) {
            System.out.println("Zero");
        } else {
            if (number > 0) {
                System.out.println("Positive number");
            } else {
                System.out.println("Negative number");
            }

            float absValue = Math.abs(number);

            if (absValue < 1) {
                System.out.println("Small number");
            } else if (absValue > 1000000) {
                System.out.println("Large number");
            }
        }

        scanner.close();
    }
}
