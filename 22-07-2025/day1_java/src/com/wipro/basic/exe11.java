package com.wipro.basic;

public class exe11 {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 3, 6, 9};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        System.out.println("Doubled values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
