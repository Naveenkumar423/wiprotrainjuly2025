package Com.Wipro.Stream;

import java.util.*;

public class AverageCalculator {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        OptionalDouble average = numbers.stream()
                                        .mapToInt(n -> n)
                                        .average();

        if (average.isPresent()) {
            System.out.println("Average: " + average.getAsDouble());
        } else {
            System.out.println("List is empty, no average.");
        }
    }
}

