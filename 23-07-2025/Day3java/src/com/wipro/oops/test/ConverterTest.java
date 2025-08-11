package com.wipro.oops.test;

import com.wipro.oops.Converter;

public class ConverterTest {
    public static void main(String[] args) {
        Converter converter = new Converter();

        int square = converter.convert(5);
        int sum = converter.convert(10, 20);
        double half = converter.convert(100.0);

        System.out.println("Square of 5: " + square);
        System.out.println("Sum of 10 and 20: " + sum);
        System.out.println("Half of 100.0: " + half);
    }
}
