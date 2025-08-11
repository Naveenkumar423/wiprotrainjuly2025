package com.wipro.basic;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Input floating-point another number: ");
        double num2 = scanner.nextDouble();

        long value1 = Math.round(num1 * 1000);
        long value2 = Math.round(num2 * 1000);

        if (value1 == value2) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");
        }

        scanner.close();
    }
}
