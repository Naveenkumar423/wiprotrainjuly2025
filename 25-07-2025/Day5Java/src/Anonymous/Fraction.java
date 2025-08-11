package Anonymous;

import java.util.function.Function;

public class Fraction {

    public static void main(String[] args) {

        Function<Double, String> getFraction = num -> {
            double fraction = num - Math.floor(num);
            return String.format("%.2f", fraction);
        };

        double input = 123.45;
        String result = getFraction.apply(input);

        System.out.println("Fractional part of " + input + " is: " + result);
    }
}
