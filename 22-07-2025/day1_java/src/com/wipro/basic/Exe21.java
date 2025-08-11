package com.wipro.basic;

public class Exe21 {
    public static void main(String[] args) {
        String s = "Naveen Kumar".toLowerCase();
        int v = 0, c = 0;
        for (char ch : s.toCharArray())
            if (ch >= 'a' && ch <= 'z')
                if ("aeiou".indexOf(ch) != -1) v++; else c++;
        System.out.println("Vowels: " + v + "\nConsonants: " + c);
    }
}

