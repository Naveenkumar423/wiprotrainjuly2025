package com.wipro.basic;

public class exe14 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

        if (arr.length == 0) {
            System.out.println("Length: 0");
            return;
        }

        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        int length = j + 1;
        System.out.println("Length after removing duplicates: " + length);

        System.out.print("Array without duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
