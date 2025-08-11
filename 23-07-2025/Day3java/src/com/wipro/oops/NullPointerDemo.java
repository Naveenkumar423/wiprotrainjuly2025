package com.wipro.oops;

public class NullPointerDemo {
    public static void main(String[] args) {
        String fName = null;

        try {
            String upperName = fName.toUpperCase();  // Will throw NullPointerException
            System.out.println("Uppercase: " + upperName);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: fName is null");
        }

        System.out.println("Program continues...");
    }
}

