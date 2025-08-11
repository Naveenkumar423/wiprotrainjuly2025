package com.wipro.collection;

public class BoxTest {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.add("Nani");
        System.out.println("String Box contains: " + stringBox.get());
        Box<Integer> intBox = new Box<>();
        intBox.add(100);
        System.out.println("Integer Box contains: " + intBox.get());
        Box<Double> doubleBox = new Box<>();
        doubleBox.add(55.5);
        System.out.println("Double Box contains: " + doubleBox.get());
    }
}
