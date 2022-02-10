package homework_13;

import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import java.util.stream.Collectors;

public class Task_2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three", "four", "five");
        List<ImmutablePair> pairList = getPair(list);


    }

    public static List<ImmutablePair> getPair(List<String> list) {
        return list.stream()
                .map(n -> new ImmutablePair(n, n.toUpperCase(Locale.ROOT)))
                .collect(Collectors.toList());
    }


}



