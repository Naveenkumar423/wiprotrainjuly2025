package com.wipro.basic;

public class exe12 {
    public static void main(String[] args) {
        int[] a = {100, 67, 98, 678, 45, 123};
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max) max = a[i];
        System.out.println("Largest: " + max);
    }
}
