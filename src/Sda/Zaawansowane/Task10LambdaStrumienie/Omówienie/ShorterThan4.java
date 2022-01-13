package Sda.Zaawansowane.Task10LambdaStrumienie.Omówienie;

import java.util.function.Predicate;

public class ShorterThan4 implements Predicate<String> {


    @Override
    public boolean test(String text) {
        return text.length() < 4;
    }
}
