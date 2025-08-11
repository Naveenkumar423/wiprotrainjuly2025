package Anonymous;

import java.util.function.Predicate;

public class CaseCheck {

    public static void main(String[] args) {

        Predicate<String> isUpperCase = str -> str.equals(str.toUpperCase());

        Predicate<String> isLowerCase = str -> str.equals(str.toLowerCase());


        String[] testStrings = {"NANI", "revanth", "Pooja", "UPPER", "lower"};

        for (String str : testStrings) {
            if (isUpperCase.test(str)) {
                System.out.println(str + " is in UPPERCASE.");
            } else if (isLowerCase.test(str)) {
                System.out.println(str + " is in lowercase.");
            } else {
                System.out.println(str + " is Mixed Case.");
            }
        }
    }
}
