package com.wipro.basic;

public class Exe19 {
    public static void main(String[] args) {
        String input = "madam"; 
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();
        if (input.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
