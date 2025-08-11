package Anonymous;

import java.util.function.Predicate;

public class Palindrome {

    public static void main(String[] args) {

        Predicate<String> isPalindrome = str ->
            str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());

        String word = "radar";

        if (isPalindrome.test(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
