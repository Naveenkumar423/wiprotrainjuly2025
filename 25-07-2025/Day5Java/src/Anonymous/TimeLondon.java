package Anonymous;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.function.Consumer;

public class TimeLondon {

    public static void main(String[] args) {

        Consumer<String> printTime = zone -> {
            System.out.println("Current time in " + zone + ": " + ZonedDateTime.now(ZoneId.of(zone)));
        };

        printTime.accept("Europe/London");
    }
}
