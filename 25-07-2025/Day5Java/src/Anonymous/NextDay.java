package Anonymous;

import java.util.function.Supplier;

public class NextDay {

    public static void main(String[] args) {

        String today = "Thursday";

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Supplier<String> getTomorrow = () -> {
            int index = java.util.Arrays.asList(days).indexOf(today);
            return days[(index + 1) % 7];
        };

        System.out.println("Tomorrow is: " + getTomorrow.get());
    }
}
