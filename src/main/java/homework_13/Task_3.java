package homework_13;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Task_3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three", "four", "FOUR", "five",
                "six", "seven", "eight", "Nine", "ten");
        list.stream()
                .filter(a -> a.length() == 4)
                .filter(a -> a.equals(a.toLowerCase(Locale.ROOT)))
                .forEach(System.out::println);
    }
}
