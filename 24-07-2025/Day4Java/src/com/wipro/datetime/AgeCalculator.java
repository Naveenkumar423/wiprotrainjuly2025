package com.wipro.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your birth year (e.g., 2000): ");
        int year = scanner.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter your birth day (1-31): ");
        int day = scanner.nextInt();

 
        LocalDate birthDate = LocalDate.of(year, month, day);

  
        LocalDate currentDate = LocalDate.now();

 
        Period age = Period.between(birthDate, currentDate);


        System.out.println("You are " + age.getYears() + " years old.");
    }
}
