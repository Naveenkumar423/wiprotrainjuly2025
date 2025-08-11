package com.wipro.basic;

public class exe13 {
    public static void main(String[] args) {
        int[] a = {10, 5, 20, 8, 15};
        int first = a[0], second = Integer.MIN_VALUE;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > first) {
                second = first;
                first = a[i];
            } else if (a[i] > second && a[i] != first) {
                second = a[i];
            }
        }

        System.out.println("Second largest: " + second);
    }
}
