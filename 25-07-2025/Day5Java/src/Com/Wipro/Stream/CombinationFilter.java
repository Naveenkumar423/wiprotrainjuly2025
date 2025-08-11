package Com.Wipro.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class CombinationFilter {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jayanta", "Amit", "Jnanedra", "Raja", "Jamal", "Anjana");

        List<String> result = names.stream()
                .filter(name -> name.toLowerCase().contains("ja"))
                .collect(Collectors.toList());

        System.out.println("Names with 'ja': " + result);
    }
}
