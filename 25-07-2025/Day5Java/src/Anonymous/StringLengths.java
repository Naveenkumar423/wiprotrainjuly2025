package Anonymous;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringLengths {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jayanta", "Amit", "Vasu");

        Function<String, Integer> getLength = str -> str.length();

        List<Integer> lengths = names.stream()
                                     .map(getLength)
                                     .collect(Collectors.toList());

        System.out.println(lengths);
    }
}
