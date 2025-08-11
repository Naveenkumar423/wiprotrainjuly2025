package Com.Wipro.Stream;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        Optional<Integer> optionalInt = Optional.of(100);

        optionalInt.ifPresent(value -> System.out.println("Value is: " + value));

        Optional<Integer> emptyOptional = Optional.empty();

        Integer result = emptyOptional.orElse(0);
        System.out.println("Result is: " + result);
    }
}
