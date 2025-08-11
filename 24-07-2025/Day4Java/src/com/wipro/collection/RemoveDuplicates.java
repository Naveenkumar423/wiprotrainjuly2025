package com.wipro.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("cherry");
        list.add("banana");

        System.out.println("Original List with Duplicates: " + list);

        Set<String> set = new LinkedHashSet<>(list);
        List<String> uniqueList = new ArrayList<>(set);

        System.out.println("List after removing duplicates: " + uniqueList);
    }
}
