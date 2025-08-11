package com.wipro.collection;

import java.util.*;

public class CurrencySort {
    public static void main(String[] args) {
        Map<String, String> currencyMap = new HashMap<>();
        currencyMap.put("USD", "United States Dollar");
        currencyMap.put("INR", "Indian Rupee");
        currencyMap.put("EUR", "Euro");
        currencyMap.put("JPY", "Japanese Yen");
     

        List<Map.Entry<String, String>> entryList = new ArrayList<>(currencyMap.entrySet());

        entryList.sort(Map.Entry.comparingByValue());

        System.out.println("Sorted Currency List:");
        for (Map.Entry<String, String> entry : entryList) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

